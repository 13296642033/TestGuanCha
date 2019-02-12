package com.bao.fuxi;

import java.util.ArrayList;
import java.util.List;

public class Maz implements OrderPeopleImp{
	
	private List<ObserverUpdateMaz> listarr = new ArrayList<>();
	private int banban;
	
	@Override
	public void addM(ObserverUpdateMaz object) {
		// TODO Auto-generated method stub
		listarr.add(object);
	}
	@Override
	public void delM(ObserverUpdateMaz object) {
		// TODO Auto-generated method stub
		listarr.remove(listarr.indexOf(object));
	}
	@Override
	public void notifyM() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listarr.size(); i++) {
			listarr.get(i).updateMaz(banban);
		}
	}
}
