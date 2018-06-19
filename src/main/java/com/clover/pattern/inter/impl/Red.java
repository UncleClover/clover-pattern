package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println(this.getClass().getName() + ":" + "填充红色");
	}
}
