package com.strategy.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.strategy.item.Item;
import com.strategy.item.defaultitems.DefaultItem;
import com.strategy.recipe.tool.consumer.RecipeConsumer;

public class CarRecipe implements IRecipe {

	@Override
	public List<Item> produce(Item... items) {
		RecipeConsumer consumer = new RecipeConsumer();
		// consumer.setConsumers(10, 4, 11, 1, 12, 1, 13, 1);
		consumer.setConsumers(DefaultItem.getNewItem(10, 4),
				DefaultItem.getNewItem(11, 1), DefaultItem.getNewItem(12, 1),
				DefaultItem.getNewItem(13, 1));

		List<Item> product = new ArrayList<>();

		if (Recipes.judge(consumer, items)) {
			Recipes.consume(consumer, items);
			product.add(DefaultItem.getNewItem(14, 1));
			produceDetial(product,
					consumer.getConsumers().stream().toArray(Item[]::new));
		}

		return product;
	}

	private void produceDetial(List<Item> products, Item... consumes) {
		for (Item item : consumes) {
			System.out.printf("消耗...%s %d 個, ", item.getName(),
					item.getNumber());
		}

		System.out.println();
		products.stream().forEach(x -> System.out.printf("生產了...%s %d 個, ",
				x.getName(), x.getNumber()));

	}

}
