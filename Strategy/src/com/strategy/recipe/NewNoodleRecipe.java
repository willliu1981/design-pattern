package com.strategy.recipe;

import com.strategy.item.Item;
import com.strategy.recipe.consumer.RecipeConsumer;

public class NewNoodleRecipe implements IRecipe {

	@Override
	public Item produce(Item... items) {
		Item product = new Item();
		product.setName("麵");
		product.setId(3);

		final int conNumber1 = 10;
		final int conNumber2 = 20;
		final int conNumber3 = 1;

		RecipeConsumer consumer = new RecipeConsumer(1, conNumber1, 2,
				conNumber2, 4, conNumber3);

		if (Recipes.judge(consumer, items)) {
			Recipes.consume(consumer, items);
			product.setNumber(25);

			System.out.printf("消耗...%s %d 個, %s %d 個 和 %s %d 個 \n",
					items[0].getName(), conNumber1, items[1].getName(),
					conNumber2, items[2].getName(), conNumber3);
			System.out.printf("生產了...%s %d 個 \n", product.getName(),
					product.getNumber());
			System.out.printf("%s 還剩 %d 個, %s 還剩 %d 個, %s 還剩 %d 個 \n",
					items[0].getName(), items[0].getNumber(),
					items[1].getName(), items[1].getNumber(),
					items[2].getName(), items[2].getNumber());
		} else {
			return null;
		}

		return product;
	}

}
