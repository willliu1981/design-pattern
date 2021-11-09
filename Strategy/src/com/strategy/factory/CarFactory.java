package com.strategy.factory;

import java.util.List;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public class CarFactory implements IFactory{
	IRecipe recipe;

	@Override
	public void setRecipe(IRecipe recipe) {
		this.recipe=recipe;
	}

	@Override
	public List<Item> produce(Item... items) {
		List<Item> lstProduct=recipe.produce(items);
		if(lstProduct.size()==0) {
			System.out.println("沒有任何生產");
		}
		return lstProduct;
	}

}
