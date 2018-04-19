package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.IRobotSV;

/**
 * 青年机器人
 * 
 * @author zhangdq
 * @Email qiang900714@126.com
 * @time 2018年4月19日 下午4:02:09
 */
public class YoungRobot implements IRobotSV {

	@Override
	public void walk() {
		System.out.println(this.getClass().getName() + ":" + "健步如飞");
	}
}
