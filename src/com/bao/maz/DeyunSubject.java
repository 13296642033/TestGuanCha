package com.bao.maz;

import java.util.ArrayList;
import java.util.List;

public class DeyunSubject implements Subject{
	//����һ�����OBS�ӿڵļ���
	private List<Observer> observer = new ArrayList<>();
	
	//�汾�� 
	private int version;
	
	
	//���˷��뼯��������ķ��� 
	@Override
	public void addObserver(Observer obj) {
			observer.add(obj);
	}
	
	//ɾ��ĳ���˵ķ���
	@Override
	public void deleteObserver(Observer obj) {
		int i = observer.indexOf(obj);//�õ�������������±�
		if(i>=0){ //����0��ɾ��
			observer.remove(obj);
		}else{
			System.out.println("���û���δ���ĵ��������־���޷�ɾ����");
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observer.size(); i++) {
			Observer ooo = observer.get(i);
			ooo.update(version);
		}
	}
	
	public void push(){
		this.version++;
		notifyObserver();
	}
	
}	
