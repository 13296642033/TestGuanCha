package com.bao.maz;

import java.util.ArrayList;
import java.util.List;
/**
 * @author egrant13
 * 
 */
public class MagazineSubject implements Subject{ //ʵ����־�ӿ� Ҫʵ���������������
    //��Ŷ�����
    private List<Observer> observers=new ArrayList<Observer>();
    //�ڿ��汾
    private int version;
    @Override
    public void addObserver(Observer obj) {
        observers.add(obj);
    }
    @Override
    public void deleteObserver(Observer obj) {
        int i = observers.indexOf(obj);
        if(i>=0){
            observers.remove(obj);
        }
    }
    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer o=(Observer)observers.get(i);
            o.update(version);
        }
    }
    //����־�������°汾
    public void publish(){
        //�°汾
        this.version++;
        //��Ϣ������ϣ�֪ͨ���й۲���
        notifyObserver();
    }
}