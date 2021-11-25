package com.test;

import java.util.LinkedList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import com.emulator.v1.resource.equipment.Equipment;

public class MyModel implements ListModel<Equipment> {
	LinkedList<Equipment> datas = new LinkedList<>();
	LinkedList<ListDataListener> listeners = new LinkedList<>();

	@Override
	public int getSize() {
		return datas.size();
	}

	public void addData(Equipment data) {
		datas.add(data);
	}

	@Override
	public Equipment getElementAt(int index) {
		return datas.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		listeners.add(l);

	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		listeners.remove(l);

	}

}
