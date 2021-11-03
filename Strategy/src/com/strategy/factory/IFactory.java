package com.strategy.factory;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public interface IFactory {
	void setRecipe(IRecipe recipe);
	void produce(Item...items);
	
}
