package com.hiya.ee.interceptor;

public interface IHiyaInterceptor
{
    public void before( Object handler);
    public void after( Object handler);
}
