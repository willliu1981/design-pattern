package com.test.test2;

import java.util.ArrayList;
import java.util.List;

import com.test.test2.ProductV2.State;

public class ProductV2 {
	public static class State {
		private String p_orign;
		private boolean p_isfresh;

		public String getP_orign() {
			return p_orign;
		}

		public void setP_orign(String p_orign) {
			this.p_orign = p_orign;
		}

		public boolean isP_isfresh() {
			return p_isfresh;
		}

		public void setP_isfresh(boolean p_isfresh) {
			this.p_isfresh = p_isfresh;
		}

	}

	private String p_name;
	private int p_num;
	private List<State> p_xxx = new ArrayList<>();

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public void add(State s) {
		this.p_xxx.add(s);
	}

}
