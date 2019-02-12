package com.bao.wither;

import java.util.ArrayList;

//���������
public class WeatherData implements Subject {

	// ����ά������ע��Ĺ۲���
	private ArrayList<Observer> observers;

	private float temperature; // �¶�
	private float humidity; // ʪ��
	private float pressure; // ��ѹ

	// ����ʱ��new���б����
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	// ע��
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	// �Ƴ�
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	// ֪ͨ����
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); ++i) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	// �����ݸı�ʱ֪ͨ����������
	public void measurementsChanged() {
		notifyObservers();
	}

	// ��������
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementsChanged();
	}
	// WeatherData�����������
}