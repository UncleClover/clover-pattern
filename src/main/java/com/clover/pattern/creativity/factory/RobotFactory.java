package com.clover.pattern.creativity.factory;

import com.clover.api.tools.common.utils.StringUtil;
import com.clover.pattern.inter.Robot;
import com.clover.pattern.inter.impl.AgedRobot;
import com.clover.pattern.inter.impl.BabyRobot;
import com.clover.pattern.inter.impl.YoungRobot;

/**
 * 机器人工厂
 * 
 * @author zhangdq
 * @Email qiang900714@126.com
 * @time 2018年4月19日 下午4:04:32
 */
public class RobotFactory {
	/**
	 * 获取某一类型的机器人
	 * 
	 * @author zhangdq
	 * @Email qiang900714@126.com
	 * @time 2018年4月19日 下午4:04:57
	 * @param type
	 */
	public Robot getRobot(String type) {
		if (StringUtil.isEmpty(type)) {
			return null;
		}

		if ("baby".equals(type)) {
			return new BabyRobot();
		} else if ("young".equals(type)) {
			return new YoungRobot();
		} else if ("aged".equals(type)) {
			return new AgedRobot();
		}
		return null;
	}
}
