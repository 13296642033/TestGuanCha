package com.bao.fuxi;

public class TestClass {
	public static void main(String[] args) {
		Maz m = new Maz();
		PeopleObs p = new PeopleObs("ÍÛ¹þ¹þ");
		PeopleObs p2 = new PeopleObs("Ë¬ÍáÍá");
		m.addM(p);
		m.addM(p2);
		m.notifyM();
	}
}
