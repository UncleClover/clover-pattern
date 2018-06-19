package com.clover.pattern.creativity.abstractfactory.extend;

import com.clover.api.tools.common.utils.StringUtil;
import com.clover.pattern.creativity.abstractfactory.AbstractFactory;
import com.clover.pattern.inter.Color;
import com.clover.pattern.inter.Robot;
import com.clover.pattern.inter.impl.AgedRobot;
import com.clover.pattern.inter.impl.BabyRobot;
import com.clover.pattern.inter.impl.Blue;
import com.clover.pattern.inter.impl.Red;
import com.clover.pattern.inter.impl.YoungRobot;

public class RealizeFactory extends AbstractFactory {
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

	@Override
	public Color getColor(String color) {
		if (StringUtil.isEmpty(color)) {
			return null;
		}

		if ("red".equals(color)) {
			return new Red();
		} else if ("blue".equals(color)) {
			return new Blue();
		}
		return null;
	}
}
