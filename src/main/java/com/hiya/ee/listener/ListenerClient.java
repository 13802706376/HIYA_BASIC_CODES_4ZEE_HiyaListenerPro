package com.hiya.ee.listener;
public class ListenerClient
{
    public static void main(String[] args)
    {
        Person person=new Person();
        person.registerListener(new MyPersonListener());
        person.registerListener(e -> {});
        person.removeListener(e -> {});
        person.run();
        person.eat();

    }
}
