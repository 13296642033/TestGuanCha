package com.bao.maz;
/**
 * @author egrant13
 * 这是观察者的接口 
 */
public interface Observer {
    //当主题状态改变时,更新通知
    public void update(int version);
}