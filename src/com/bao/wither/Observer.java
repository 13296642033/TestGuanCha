package com.bao.wither;

/***
 * �۲��߽ӿ�
 * 
 * @author LiuJing
 *
 */
public interface Observer {
	/***
	 * ���Ը�������
	 * 
	 * @param temp
	 *            �¶�
	 * @param humidity
	 *            ʪ��
	 * @param pressure
	 *            ��ѹ
	 */
	public void update(float temp, float humidity, float pressure);
}
