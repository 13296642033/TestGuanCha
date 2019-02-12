package com.bao.wither;

/***
 * 主题接口 Subject.java
 * 
 * @author LiuJing
 *
 */
public interface Subject {

	/***
	 * 用以注册观察者
	 * 
	 * @param o
	 *            具体的观察者
	 */
	public void registerObserver(Observer o);

	/***
	 * 用以删除观察者
	 * 
	 * @param o
	 *            具体的观察者
	 */
	public void removeObserver(Observer o);

	/***
	 * 用以通知所有注册的观察者
	 */
	public void notifyObservers();
}