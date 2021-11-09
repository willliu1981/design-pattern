package com.strategy.recipe;

import java.util.List;

import com.strategy.item.Item;

public interface IRecipe {
	List<Item> produce(Item... items);
}
