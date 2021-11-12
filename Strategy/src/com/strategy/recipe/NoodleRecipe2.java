package com.strategy.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.strategy.item.Item;
import com.strategy.item.defaultitems.DefaultItem;
import com.strategy.main.exception.ProduceErrorException;
import com.strategy.recipe.tool.consumer.RecipeConsumer;

public class NoodleRecipe2 implements IRecipe {

	@Override
	public List<Item> produce(Item... items) {

		RecipeConsumer consumer = new RecipeConsumer();
		// consumer.setConsumers(1, 20, 2, 10, 4, 1);
		consumer.setConsumers(DefaultItem.getNewItem(1, 20),
				DefaultItem.getNewItem(2, 10), DefaultItem.getNewItem(4, 1));

		List<Item> lstProduct = new ArrayList<>();

		if (Recipes.judge(consumer, items)) {
			Recipes.consume(consumer, items);

			Item product1 = DefaultItem.getNewItem(3, 25);

			lstProduct.add(product1);
			Recipes.add(Arrays.asList(items), lstProduct);

			Recipes.produceDetial(lstProduct, consumer.getConsumers());
		} else {
			throw new ProduceErrorException(consumer.getConsumers());
		}

		return lstProduct;
	}

}
