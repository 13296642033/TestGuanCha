package com.bao.maz;

public class Test {
    public static void main(String[] args) {
        //��������(���۲���)
        MagazineSubject magazine = new MagazineSubject();
        //����������ͬ�Ĺ۲���
        CustomerObserver a = new CustomerObserver("A");
        CustomerObserver b = new CustomerObserver("B");
        CustomerObserver c = new CustomerObserver("C");
        //���۲���ע�ᵽ������
        magazine.addObserver(a);
        magazine.addObserver(b);
        magazine.addObserver(c);
        

        //������������ݣ������ݸ��º󣬻��Զ�֪ͨ������ע��Ĺ۲���
        for (int i = 0; i < 3; i++) {
        	 magazine.publish();
        	 System.out.println();
		}
        
        DeyunSubject deyunmaz = new DeyunSubject();
        CustomerObserver huyandi = new CustomerObserver("huyandi");
        CustomerObserver wahaha = new CustomerObserver("wahaha");
        
        deyunmaz.addObserver(huyandi);
        deyunmaz.addObserver(wahaha);
        deyunmaz.deleteObserver(c);
        deyunmaz.push();
    }
}
