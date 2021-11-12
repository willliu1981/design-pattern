package com.strategy.factory;

import java.util.List;

import com.strategy.item.Item;
import com.strategy.recipe.IRecipe;

public interface IFactory {
	void setRecipe(IRecipe recipe);

	List<Item> produce(Item... items);

	default List<Item> produce(List<Item> items) {
		return produce(items.stream().toArray(Item[]::new));
	}

}
