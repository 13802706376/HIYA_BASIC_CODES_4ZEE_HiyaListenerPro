package com.hiya.ee.interceptor;

public class BusinessInterceptor implements IHiyaInterceptor
{
    @Override
    public void before(Object handler)
    {
        System.out.println("BusinessInterceptor  before.......");
    }

    @Override
    public void after(Object handler)
    {
        System.out.println("BusinessInterceptor  after.......");
    }
}
