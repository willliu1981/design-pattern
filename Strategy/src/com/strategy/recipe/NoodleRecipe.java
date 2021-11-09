package com.strategy.recipe;

import java.util.ArrayList;
import java.util.List;

import com.strategy.item.Item;
import com.strategy.recipe.tool.consumer.RecipeConsumer;

public class NoodleRecipe implements IRecipe {

	@Override
	public List<Item> produce(Item... items) {
		List<Item> lstProduct = new ArrayList<>();
		Item product = new Item();
		product.setName("麵");
		product.setId(3);

		final int conNumber1 = 1;
		final int conNumber2 = 4;

		RecipeConsumer consumer = new RecipeConsumer();
//		consumer.addConsumer(1, conNumber1);
//		consumer.addConsumer(2, conNumber2);
		consumer.setConsumers(1, conNumber1, 2, conNumber2);

		if (Recipes.judge(consumer, items)) {
			Recipes.consume(consumer, items);
			product.setNumber(2);

			System.out.printf("消耗...%s %d 個 和 %s %d 個 \n", items[0].getName(),
					conNumber1, items[1].getName(), conNumber2);
			System.out.printf("生產了...%s %d 個 \n", product.getName(),
					product.getNumber());
			System.out.printf("%s 還剩 %d 個, %s 還剩 %d 個 \n", items[0].getName(),
					items[0].getNumber(), items[1].getName(),
					items[1].getNumber());
		} else {
			return null;
		}

		lstProduct.add(product);
		return lstProduct;
	}

}
