package com.strategy.recipe;

import com.strategy.item.Item;

public class NewNoodleRecipe implements IRecipe {

	@Override
	public Item produce(Item... items) {
		Item product = new Item();
		product.setName("麵");
		product.setId(3);

		if (items[0].getId() == 1 && items[1].getId() == 2
				&& items[2].getId() == 4) {
			if (items[0].getNumber() >= 10 && items[1].getNumber() >= 20
					&& items[2].getNumber() >= 1) {
				items[0].setNumber(items[0].getNumber() - 10);
				items[1].setNumber(items[1].getNumber() - 20);
				items[2].setNumber(items[2].getNumber() - 1);
				product.setNumber(20);

				System.out.printf("消耗...%s %d 個, %s %d 個 和 %s %d 個 \n",
						items[0].getName(), 10, items[1].getName(), 20,
						items[2].getName(), 1);
				System.out.printf("生產了...%s %d 個 \n", product.getName(),
						product.getNumber());
				System.out.printf("%s 還剩 %d 個, %s 還剩 %d 個, %s 還剩 %d 個 \n",
						items[0].getName(), items[0].getNumber(),
						items[1].getName(), items[1].getNumber(),
						items[2].getName(), items[2].getNumber());

			} else {
				return null;
			}

		} else {
			return null;
		}

		return product;
	}

}
