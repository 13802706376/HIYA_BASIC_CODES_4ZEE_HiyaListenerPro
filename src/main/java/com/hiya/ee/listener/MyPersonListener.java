package com.hiya.ee.listener;
public class MyPersonListener implements IPersonListener
{
    @Override
    public void doRun(Event<Person> event)
    {
        Person person = event.getT();
        System.out.println("人在跑之前执行的动作" + person);
    }
}