package com.clover.pattern.creativity.abstractfactory;

import com.clover.pattern.inter.Color;
import com.clover.pattern.inter.Robot;

/**
 * 抽象工厂
 * 
 * @author UncleClover
 * @Email qiang900714@126.com
 * @time 2018年4月20日 上午10:50:53
 */
public abstract class AbstractFactory {
	/**
	 * 获取机器人
	 * 
	 * @author UncleClover
	 * @Email qiang900714@126.com
	 * @time 2018年4月20日 上午10:52:32
	 * @param type
	 * @return
	 */
	public abstract Robot getRobot(String type);

	/**
	 * 获取颜色
	 * 
	 * @author UncleClover
	 * @Email qiang900714@126.com
	 * @time 2018年4月20日 上午10:52:19
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);
}
