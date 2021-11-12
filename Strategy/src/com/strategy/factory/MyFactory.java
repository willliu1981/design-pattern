package com.strategy.factory;

import java.util.List;

import com.strategy.item.Item;
import com.strategy.main.exception.ProduceErrorException;
import com.strategy.recipe.IRecipe;

public class MyFactory implements IFactory {

	IRecipe recipe;

	@Override
	public void setRecipe(IRecipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public List<Item> produce(Item... items) {
		List<Item> lstProduct = null;
		try {
			lstProduct = recipe.produce(items);
		} catch (ProduceErrorException e) {
			System.out.println(e.getMessage());
		}
		return lstProduct;
	}

}
