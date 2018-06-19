package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.Robot;

/**
 * 青年机器人
 * 
 * @author UncleClover
 * @Email qiang900714@126.com
 * @time 2018年4月19日 下午4:02:09
 */
public class YoungRobot implements Robot {

	@Override
	public void walk() {
		System.out.println(this.getClass().getName() + ":" + "健步如飞");
	}
}
