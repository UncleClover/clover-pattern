package com.clover.pattern.test.factory;

import org.junit.jupiter.api.Test;

import com.clover.pattern.creativity.factory.RobotFactory;
import com.clover.pattern.inter.IRobotSV;

class RobotFactoryTest {

	@Test
	void test() {
		RobotFactory robotFactory = new RobotFactory();
		IRobotSV robot = robotFactory.getRobot("baby");
		robot.walk();
	}
}
