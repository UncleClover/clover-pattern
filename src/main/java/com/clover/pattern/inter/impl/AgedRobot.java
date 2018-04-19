package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.IRobotSV;

public class AgedRobot implements IRobotSV {

	@Override
	public void walk() {
System.out.println(this.getClass().getName() + ":" + "步履蹒跚");
	}
}
