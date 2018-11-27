package com.hiya.ee.interceptor;

public class BookInterceptor implements IHiyaInterceptor
{
    @Override
    public void before(Object handler)
    {
        System.out.println("BookInterceptor  before.......");
    }

    @Override
    public void after(Object handler)
    {
        System.out.println("BookInterceptor  after.......");
    }
}
