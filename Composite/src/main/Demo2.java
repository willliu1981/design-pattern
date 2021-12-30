package main;

import component.Component;
import component.G1;
import component.G2;
import component.G3;
import component.L;
import component.SubGameObject;

public class Demo2 {

	public static void main(String[] args) {
		Component g1 = new G1("G1", "~g1~");

		Component g2_1 = new G2("G2-1", "~g2-1~");
		Component g2_2 = new G2("G2-2", "~g2-2~");

		Component g3_1 = new G3("G3-1", "~g3-1~");
		Component g3_2 = new G3("G3-2", "~g3-2~");
		Component g3_3 = new G3("G3_3", "~g3_3~");

		Component l1 = new L("L1", "~l1~");
		Component l2 = new L("L2", "~l2~");
		Component l3 = new L("L3", "~l3~");
		Component l4 = new L("L4", "~l4~");
		Component l5 = new L("L5", "~l5~");

		g1.add(g2_1);
		g1.add(g2_2);

		g2_1.add(g3_1);
		g2_2.add(g3_2);
		g2_2.add(g3_3);

		g3_1.add(l1);
		g3_1.add(l2);
		g3_2.add(l3);
		g3_3.add(l4);
		g3_3.add(l5);

		g1.print();

	}

}
