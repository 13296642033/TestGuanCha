package com.bao.maz;
/**
 * @author egrant13
 * 观察者的实现类 
 */
public class CustomerObserver implements Observer{//需要实现更新杂志的方法
    //订阅者名字
    private String name;
    //版本
    private int version;

    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(int version) {
        this.version=version;
        System.out.println("该杂志出新版本了");
        this.buy();
    }
 
    public void buy(){
        System.out.println(name+"购买了第"+version+"期的杂志!");
    }

}