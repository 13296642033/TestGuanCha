package com.bao.maz;
/**
 * @author egrant13
 * �۲��ߵ�ʵ���� 
 */
public class CustomerObserver implements Observer{//��Ҫʵ�ָ�����־�ķ���
    //����������
    private String name;
    //�汾
    private int version;

    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(int version) {
        this.version=version;
        System.out.println("����־���°汾��");
        this.buy();
    }
 
    public void buy(){
        System.out.println(name+"�����˵�"+version+"�ڵ���־!");
    }

}