package com.bao.wither;

/**
 * @author egrant13 StatisticsDisplay.java ��ʾ2 ����ͳ�ƣ�������ʾ��ߡ���͡�ƽ������
 */
public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f; // ����¶�
	private float minTemp = 0.0f; // ����¶�
	private float tempSum = 0.0f; // �¶ȸ��º�
	private int numReadings; // �¶ȸ��´���

	Subject weatherData; // ����

	// ͬ ��ʾ1
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	// ��ʾ
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("2,ƽ���¶ȣ�" + (tempSum / numReadings) + ",����¶ȣ�" + maxTemp + ",��С�¶ȣ�" + minTemp);
	}

	// ����
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub

		// ͳ���¶Ⱥʹ��� �������ƽ���¶�
		float temp = temperature;
		tempSum += temp;
		numReadings++;

		// ��������¶�
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		// ��������¶�
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}
}