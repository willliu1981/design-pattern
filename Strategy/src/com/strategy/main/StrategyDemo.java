package com.strategy.main;

import com.strategy.factory.NoodleFactory;
import com.strategy.item.Item;
import com.strategy.recipe.NewNoodleRecipe;
import com.strategy.recipe.NoodleRecipe;

public class StrategyDemo {
	public static void main(String[] s) {
		// System.out.println("test");

		Item flour = new Item();
		flour.setName("麵粉");
		flour.setId(1);
		flour.setNumber(100);

		Item water = new Item();
		water.setName("水");
		water.setId(2);
		water.setNumber(200);

		Item salt = new Item();
		salt.setName("鹽");
		salt.setId(4);
		salt.setNumber(50);

		System.out.println("生產前...");
		System.out.printf("%s 還剩 %d 個, %s 還剩 %d 個, %s 還剩 %d 個 \n",
				flour.getName(), flour.getNumber(), water.getName(),
				water.getNumber(), salt.getName(), salt.getNumber());

		System.out.println("\n更改配方前...");
		NoodleFactory factory = new NoodleFactory();
		factory.setRecipe(new NoodleRecipe());
		factory.produce(flour, water);

		System.out.println("\n更改配方後...");
		factory.setRecipe(new NewNoodleRecipe());
		factory.produce(flour, water, salt);

	}
}
