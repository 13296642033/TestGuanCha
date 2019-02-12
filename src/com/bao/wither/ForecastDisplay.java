package com.bao.wither;

/**
 * @author egrant13 ForecastDisplay.java ��ʾ3 ����Ԥ��
 */
public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 28.82f; // ��ǰ��ѹ
	private float lastPressure; // ��һ�ε���ѹ
	private Subject weatherData; // ����

	// ͬ��ʾ1
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	// ��ʾ
	public void display() {
		// TODO Auto-generated method stub

		if (currentPressure > lastPressure) {
			System.out.println("3,����Ԥ�����¶����ڳ���������");
		} else {
			System.out.println("3,����Ԥ����ע�������½��ˣ��������꣡");
		}
	}

	// ����
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}
}