package com.strategy.recipe.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.strategy.item.Item;

public class RecipeConsumer {
	private List<Item> consumers;

	public RecipeConsumer(int... ints) {
		setConsumers(ints);
	}

	public void setConsumers(Item... items) {
		consumers = Stream.of(items).collect(Collectors.toList());
	}

	public void setConsumers(int... ints) {
		this.consumers = null;
		int step = 0;
		int lastID = -1;
		for (int _int : ints) {
			switch (step) {
			case 0:
				getConsumers().add(new Item(_int, 0));
				lastID = _int;
				break;
			case 1:
				int id = lastID;
				getConsumers().stream().filter(x -> x.getId() == id).findAny()
						.get().setNumber(_int);
				break;
			}

			step = 1 - step;
		}

	}

	public void addConsumer(int id, int number) {
		getConsumers().add(new Item(id, number));
	}

	public List<Item> getConsumers() {
		if (this.consumers == null) {
			this.consumers = new ArrayList<>();
		}
		return this.consumers;
	}

}
