package com.strategy.factory;

import java.util.ArrayList;
import java.util.List;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public class NoodleFactory implements IFactory {

	IRecipe recipe;

	@Override
	public void setRecipe(IRecipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public List<Item> produce(Item... items) {
		List<Item> lstProduct = recipe.produce(items);
		if (lstProduct == null) {
			System.out.println("沒有任何生產");
		}
		return lstProduct;
	}

}
