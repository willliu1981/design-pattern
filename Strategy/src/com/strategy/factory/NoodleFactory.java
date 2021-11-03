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
		if (product == null) {
			System.out.println("沒有任何生產");
		}

	}

}
