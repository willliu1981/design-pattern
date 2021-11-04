package com.strategy.recipe;

import java.util.Optional;

import org.junit.Test;

import com.strategy.item.Item;
import com.strategy.recipe.consumer.RecipeConsumer;

public class Recipes {

	public static boolean judge(RecipeConsumer consumer, Item... items) {
		for (Item item : items) {
			Optional<Item> op = consumer.getConsumers().stream()
					.filter(x -> x.getId() == item.getId()).findAny();
			if (!findConsumer(consumer, item).isPresent()) {
				return false;
			}

			if (item.getNumber() < op.get().getNumber()) {
				return false;
			}

		}

		return true;
	}

	public static void consume(RecipeConsumer consumer, Item... items) {
		for (Item item : items) {
			item.setNumber(item.getNumber()
					- findConsumer(consumer, item).get().getNumber());
		}
	}

	private static Optional<Item> findConsumer(RecipeConsumer consumer,
			Item item) {
		return consumer.getConsumers().stream()
				.filter(x -> x.getId() == item.getId()).findAny();
	}

	@Test
	public void test() {
		RecipeConsumer con = new RecipeConsumer();
		Item it1 = new Item(1, 5);
		Item it2 = new Item(2, 10);

		con.setConsumers(it1, it2);

		Item it11 = new Item(1, 5);
		Item it22 = new Item(2, 10);

		boolean r = Recipes.judge(con, it11, it22);

		System.out.println(r);

	}
}
