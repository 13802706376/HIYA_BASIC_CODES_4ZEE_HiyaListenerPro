package com.hiya.ee.listener;
@FunctionalInterface
public interface IPersonListener
{
    public void doRun(Event<Person> t);
}
