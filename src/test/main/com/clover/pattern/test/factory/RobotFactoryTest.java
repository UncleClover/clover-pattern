package com.clover.pattern.test.factory;

import org.junit.Test;

import com.clover.pattern.creativity.factory.RobotFactory;
import com.clover.pattern.inter.Robot;

class RobotFactoryTest {

	@Test
	void test() {
		RobotFactory robotFactory = new RobotFactory();
		Robot robot = robotFactory.getRobot("baby");
		robot.walk();
	}
}
