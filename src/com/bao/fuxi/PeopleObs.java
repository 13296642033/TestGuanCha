package com.bao.fuxi;
/**
 * @author egrant13
 * �����൱����ÿһ���˵Ķ���
 * 
 */
public class PeopleObs implements ObserverUpdateMaz{
	private String name; //������־������
	private int banben;  //��־�İ汾
	
	
	//��ʼ�����췽�� Ҫ������ 
	public PeopleObs(String name) {
		super();  
		this.name = name;//��ǰ��name���ڴ�������name
	}


	@Override
	public void updateMaz(int banben) {
		this.banben=banben;//�汾Ϊ�������İ汾
		System.out.println("NEW VES!");
		this.buy();//�����Լ�����ķ���
	}	
	
	public void buy(){  // ��� ˭���˵ڼ��ڵ���־
		System.out.println(name+"buy��"+banben+"maz");
	}
}
