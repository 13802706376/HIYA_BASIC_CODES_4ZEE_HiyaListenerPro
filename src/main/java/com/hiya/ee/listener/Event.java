package com.hiya.ee.listener;

public class Event<T>
{
    private T t;

    public Event(T t)
    {
        super();
        this.t = t;
    }

    public Event()
    {
        super();
    }

    public T getT()
    {
        return t;
    }

    public void setT(T t)
    {
        this.t = t;
    }
}
