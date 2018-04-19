package com.clover.pattern.inter.impl;

import com.clover.pattern.inter.Robot;

/**
 * 婴儿类型机器人
 * 
 * @author zhangdq
 * @Email qiang900714@126.com
 * @time 2018年4月19日 下午4:00:11
 */
public class BabyRobot  implements Robot{

	@Override
	public void walk() {
		System.out.println(this.getClass().getName() + ":" + "爬行");
	}
}
