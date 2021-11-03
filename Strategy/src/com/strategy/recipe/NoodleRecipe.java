package com.strategy.recipe;

import com.strategy.item.Item;

public class NoodleRecipe implements IRecipe {

	@Override
	public Item produce(Item... items) {
		Item product = new Item();
		product.setName("麵");
		product.setId(3);

		if (items[0].getId() == 1 && items[1].getId() == 2) {
			if (items[0].getNumber() >= 1 && items[1].getNumber() >= 1) {
				items[0].setNumber(items[0].getNumber() - 1);
				items[1].setNumber(items[1].getNumber() - 1);
				product.setNumber(2);
			} else {
				return null;
			}

		} else {
			return null;
		}

		return product;
	}

}
