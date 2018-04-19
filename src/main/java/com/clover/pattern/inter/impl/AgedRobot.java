package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.Robot;

public class AgedRobot implements Robot {

	@Override
	public void walk() {
System.out.println(this.getClass().getName() + ":" + "步履蹒跚");
	}
}
