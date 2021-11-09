package com.strategy.factory;

import java.util.List;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public interface IFactory {
	void setRecipe(IRecipe recipe);
	List<Item> produce(Item...items);
	
}
