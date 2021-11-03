package com.strategy.recipe;

import com.strategy.item.Item;

public interface IRecipe {
	Item produce(Item... items);
}
