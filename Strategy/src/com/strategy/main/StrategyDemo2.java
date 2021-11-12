package com.strategy.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.strategy.factory.MyFactory;
import com.strategy.factory.NoodleFactory;
import com.strategy.item.Item;
import com.strategy.item.defaultitems.DefaultItem;
import com.strategy.main.tool.ProduceDetail;
import com.strategy.recipe.CarRecipe;
import com.strategy.recipe.NoodleRecipe2;

public class StrategyDemo2 {
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		// init stove
		List<Item> lstStove = new ArrayList<>();
		lstStove.add(DefaultItem.getNewItem(1, 100));
		lstStove.add(DefaultItem.getNewItem(2, 100));
		lstStove.add(DefaultItem.getNewItem(3, 100));
		lstStove.add(DefaultItem.getNewItem(4, 100));
		lstStove.add(DefaultItem.getNewItem(10, 100));
		lstStove.add(DefaultItem.getNewItem(11, 100));
		lstStove.add(DefaultItem.getNewItem(12, 100));
		lstStove.add(DefaultItem.getNewItem(13, 100));
		lstStove.add(DefaultItem.getNewItem(14, 100));

		// init facotry and recipe
		MyFactory noodleFactory = new MyFactory();
		noodleFactory.setRecipe(new NoodleRecipe2());

		MyFactory carFactory = new MyFactory();
		carFactory.setRecipe(new CarRecipe());

		System.out.println("目前庫存: " + ProduceDetail
				.quantityDetail(lstStove.stream().toArray(Item[]::new)));

		boolean isContinue = true;
		while (isContinue) {
			System.out.println("\n生產項目:[1]:麵條, [2]:汽車, [-1]:離開 \n>: ");
			int in = sc.nextInt();

			switch (in) {
			case 1:
				noodleFactory.produce(lstStove);
				detail(lstStove);
				break;
			case 2:
				carFactory.produce(lstStove);
				detail(lstStove);
				break;
			case -1:
				isContinue = false;
				System.out.println("離開工廠");
				break;
			}

		}

	}

	private static void detail(List<Item> lstStove) {
		System.out.println("\n目前庫存: " + ProduceDetail
				.quantityDetail(lstStove.stream().toArray(Item[]::new)));
	}
}
