package com.bao.maz;
/**
 * @author egrant13
 * ����ӿ�
 * �������������� 
 */
public interface Subject {
    //��ӹ۲���
    void addObserver(Observer obj);
    //�Ƴ��۲���
    void deleteObserver(Observer obj);
    //�����ⷽ���ı�ʱ,�������������,֪ͨ���еĹ۲���
    void notifyObserver();
}