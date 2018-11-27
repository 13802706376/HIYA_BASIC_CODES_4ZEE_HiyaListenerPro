package com.hiya.ee.interceptor;

public class BookService implements IBook
{
    @Override
    public void doBook()
    {
        System.out.println("doBook.......");
    }
}
