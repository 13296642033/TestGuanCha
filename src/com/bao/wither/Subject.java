package com.bao.wither;

/***
 * ����ӿ� Subject.java
 * 
 * @author LiuJing
 *
 */
public interface Subject {

	/***
	 * ����ע��۲���
	 * 
	 * @param o
	 *            ����Ĺ۲���
	 */
	public void registerObserver(Observer o);

	/***
	 * ����ɾ���۲���
	 * 
	 * @param o
	 *            ����Ĺ۲���
	 */
	public void removeObserver(Observer o);

	/***
	 * ����֪ͨ����ע��Ĺ۲���
	 */
	public void notifyObservers();
}