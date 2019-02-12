package com.bao.wither;

/***
 * 观察者接口
 * 
 * @author LiuJing
 *
 */
public interface Observer {
	/***
	 * 用以更新数据
	 * 
	 * @param temp
	 *            温度
	 * @param humidity
	 *            湿度
	 * @param pressure
	 *            气压
	 */
	public void update(float temp, float humidity, float pressure);
}
