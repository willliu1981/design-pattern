package com.strategy.recipe;

import com.strategy.item.Item;

public class NoodleRecipe implements IRecipe {

	@Override
	public Item produce(Item... items) {
		Item product = new Item();
		product.setName("麵");
		product.setId(3);

		if (items[0].getId() == 1 && items[1].getId() == 2) {
			if (items[0].getNumber() >= 1 && items[1].getNumber() >= 2) {
				items[0].setNumber(items[0].getNumber() - 1);
				items[1].setNumber(items[1].getNumber() - 2);
				product.setNumber(2);

				System.out.printf("消耗...%s %d 個 和 %s %d 個 \n",
						items[0].getName(), 1, items[1].getName(), 2);
				System.out.printf("生產了...%s %d 個 \n", product.getName(),
						product.getNumber());
				System.out.printf("%s 還剩 %d 個, %s 還剩 %d 個 \n",
						items[0].getName(), items[0].getNumber(),
						items[1].getName(), items[1].getNumber());
			} else {
				return null;
			}

		} else {
			return null;
		}

		return product;
	}

}
