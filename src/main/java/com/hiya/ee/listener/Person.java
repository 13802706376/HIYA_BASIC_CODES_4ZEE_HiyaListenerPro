package com.hiya.ee.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * 监听器 核心原理就是  事件源 持有 事件对象的对象，在某个方法之前 执行事件对象中的逻辑
 * 用户可以往事件监听器中注册 事件对象 
 * @author zjq
 *
 */
public class Person
{
    private List<IPersonListener> listeners = new ArrayList<>();
    public void registerListener(IPersonListener personListener)
    {
        listeners.add(personListener);
    }

    public void removeListener(IPersonListener personListener)
    {
        listeners.remove(personListener);
    }
    
    public void run()
    {
        if(null!=listeners )
        {
             for(IPersonListener listener:listeners)
             {
                 Event<Person> event = new Event<Person>(this);
                 listener.doRun(event);
             }
        }
        System.out.println("人具有跑的方法");
    }

    public void eat()
    {
        System.out.println("人具有吃的方法");
    }
}
