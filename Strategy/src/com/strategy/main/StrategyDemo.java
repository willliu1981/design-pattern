package com.strategy.main;

import java.util.ArrayList;
import java.util.List;

import com.strategy.factory.CarFactory;
import com.strategy.factory.NoodleFactory;
import com.strategy.item.Item;
import com.strategy.item.defaultitems.DefaultItem;
import com.strategy.recipe.CarRecipe;
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

		System.out.println("\n生產汽車...");
		CarFactory carFactory = new CarFactory();
		carFactory.setRecipe(new CarRecipe());
		List<Item> lstCarProjuctStove = new ArrayList<>();
		lstCarProjuctStove.add(DefaultItem.getNewItem(10, 100));
		lstCarProjuctStove.add(DefaultItem.getNewItem(11, 200));
		lstCarProjuctStove.add(DefaultItem.getNewItem(12, 50));
		lstCarProjuctStove.add(DefaultItem.getNewItem(13, 10));
		List<Item> lstCarProduce = carFactory
				.produce(lstCarProjuctStove.stream().toArray(Item[]::new));
		System.out.println();
		lstCarProjuctStove.stream().forEach(x -> System.out.printf("庫存: %s %d 個, ",
				x.getName(), x.getNumber()));

	}
}
