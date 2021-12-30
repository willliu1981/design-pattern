package main;

import component.Component;
import component.GameObject;
import component.LeafGameObject;
import component.SubGameObject;

public class Demo {

	public static void main(String[] args) {
		Component c1 = new GameObject("C1", "~c1~");

		Component s1 = new SubGameObject("S1", "~s1~");
		Component s2 = new SubGameObject("S2", "~s2~");

		Component l1 = new LeafGameObject("L1", "~l1~");
		Component l2 = new LeafGameObject("L2", "~l2~");
		Component l3 = new LeafGameObject("L3", "~l3~");

		c1.add(s1);
		c1.add(s2);

		s1.add(l1);
		s2.add(l2);
		s2.add(l3);

		c1.print();

	}

}
