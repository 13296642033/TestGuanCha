package com.bao.fuxi;
/**
 * @author egrant13
 * 这类相当于是每一个人的对象
 * 
 */
public class PeopleObs implements ObserverUpdateMaz{
	private String name; //订阅杂志的姓名
	private int banben;  //杂志的版本
	
	
	//初始化构造方法 要给名字 
	public PeopleObs(String name) {
		super();  
		this.name = name;//当前的name等于传过来的name
	}


	@Override
	public void updateMaz(int banben) {
		this.banben=banben;//版本为传过来的版本
		System.out.println("NEW VES!");
		this.buy();//调用自己下面的方法
	}	
	
	public void buy(){  // 输出 谁买了第几期的杂志
		System.out.println(name+"buy："+banben+"maz");
	}
}
