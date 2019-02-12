package com.bao.maz;

import java.util.ArrayList;
import java.util.List;

public class DeyunSubject implements Subject{
	//定义一个存放OBS接口的集合
	private List<Observer> observer = new ArrayList<>();
	
	//版本号 
	private int version;
	
	
	//把人放入集合里里面的方法 
	@Override
	public void addObserver(Observer obj) {
			observer.add(obj);
	}
	
	//删除某个人的方法
	@Override
	public void deleteObserver(Observer obj) {
		int i = observer.indexOf(obj);//得到传过来对象的下标
		if(i>=0){ //大于0就删除
			observer.remove(obj);
		}else{
			System.out.println("该用户尚未订阅德云社的杂志，无法删除！");
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
