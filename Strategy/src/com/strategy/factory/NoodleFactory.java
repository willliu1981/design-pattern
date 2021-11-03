package com.strategy.factory;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public class NoodleFactory implements IFactory {

	IRecipe recipe;

	@Override
	public void setRecipe(IRecipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public void produce(Item... items) {
		Item product = recipe.produce(items);

		System.out.printf("消耗...%s %d 個 和 %s %d 個 \n", items[0].getName(), items[0].getNumber(), items[1].getName(),
				items[0].getNumber());
		System.out.printf("生產了...%s %d 個 \n" , product.getName(),product.getNumber());

	}

}
