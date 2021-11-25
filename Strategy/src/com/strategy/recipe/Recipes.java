package com.strategy.recipe;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import com.strategy.item.Item;
import com.strategy.main.tool.ProduceDetail;
import com.strategy.recipe.tool.consumer.RecipeConsumer;

public class Recipes {

	public static boolean judge(RecipeConsumer consumer, Item... inputs) {
		for (Item consumerItem : consumer.getConsumers()) {
			Optional<Item> opFind = findItemFromItems(consumerItem, inputs);
			if (!opFind.isPresent()) {
				return false;
			}

			if (consumerItem.getNumber() > opFind.get().getNumber()) {
				return false;
			}
		}

		return true;
	}

	public static void consume(RecipeConsumer consumer, Item... items) {
		for (Item item : consumer.getConsumers()) {
			Item opFind = findItemFromItems(item, items).get();
			opFind.setNumber(opFind.getNumber() - item.getNumber());
		}
	}

	public static void add(List<Item> oldItems, List<Item> newItems) {
		for (Item item : newItems) {
			Item opFind = findItemFromItems(item,
					oldItems.stream().toArray(Item[]::new)).get();
			opFind.setNumber(opFind.getNumber() + item.getNumber());
		}
	}

	private static Optional<Item> findItemFromItems(Item item,

			Item... items) {

		return Arrays.asList(items).stream()
				.filter(x -> x.getId() == item.getId()).findAny();
	}

	public static void produceDetial(List<Item> products, Item... consumers) {
		System.out.printf("消耗...%s\n生產了...%s",
				ProduceDetail.quantityDetail(consumers),
				ProduceDetail.quantityDetail(
						products.stream().toArray(Item[]::new)));
	}

	public static void produceDetial(List<Item> products,
			List<Item> consumers) {
		produceDetial(products, consumers.stream().toArray(Item[]::new));
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
