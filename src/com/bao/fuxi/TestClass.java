package com.bao.fuxi;

public class TestClass {
	public static void main(String[] args) {
		// ����git�ύ����
		Maz m = new Maz();
		PeopleObs p = new PeopleObs("�۹���");
		PeopleObs p2 = new PeopleObs("ˬ����");
		m.addM(p);
		m.addM(p2);
		m.notifyM();
	}
}
