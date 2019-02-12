package com.bao.wither;

/**
 * @author egrant13 CurrentConditionsDisplay.java ��ʾ1 ����壬��ʾ�¶ȡ�ʪ��
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature; // �¶�
	private float humidity; // ʪ��
	private Subject weatherData; // ����

	// ��ǰ����� ����֮ʱ ���� �� ����
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	// ��ʾ
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("1,��ǰ�����: �¶�" + temperature + "��,ʪ��" + humidity + "%");
	}

	// ����
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;

		display();
	}
}