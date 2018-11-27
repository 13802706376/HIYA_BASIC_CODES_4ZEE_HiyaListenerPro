package com.hiya.ee.interceptor;

public class InterceptorClient
{

    public static void main(String[] args)
    {
        HiyaProxy handler = new HiyaProxy();
        
        IBusiness business = (IBusiness) handler.bind(new BusinessService(),new BusinessInterceptor());
        business.doBusiness();
        
        IBook book = (IBook) handler.bind(new BookService(),new BookInterceptor());
        book.doBook();
    }
}
