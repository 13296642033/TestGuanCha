package com.bao.wither;

public class Test {

	public static void main(String[] args) {

		// 1,�½�һ����������
		WeatherData weatherData = new WeatherData();

		// 2,�½���ʾ1-��ǰ״̬����ʾ2-����ͳ�ƣ���ʾ3-����Ԥ��
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// 3,����������������
		weatherData.setMeasurements(20, 65, 30.4f);
		System.out.println();
		weatherData.setMeasurements(30, 70, 29.2f);
		System.out.println();
		weatherData.setMeasurements(25, 90, 29.2f);
	}
}