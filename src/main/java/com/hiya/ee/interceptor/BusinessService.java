package com.hiya.ee.interceptor;

public class BusinessService implements IBusiness
{
    @Override
    public void doBusiness()
    {
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
}
