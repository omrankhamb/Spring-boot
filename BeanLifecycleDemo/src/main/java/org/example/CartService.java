package org.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
@Scope("prototype")
public class CartService implements BeanNameAware, ApplicationContextAware
        //DisposableBean
        //implements InitializingBean
{

    Map<Integer,String> mp;


    public CartService() {
        mp = new HashMap<>();
        mp.put(1,"Aditya");
        mp.put(2,"Rohit");
        System.out.println("CartService constructor Called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : " +name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("ApplicationContextAware name " + applicationContext.getClass());
    }

    @PostConstruct
    public void start2()
    {
        System.out.println("Start 2 method is called");
        mp.put(1,"Aditya");
        mp.put(2,"Rohit");
    }

    @PreDestroy
    public void stop2()
    {
        System.out.println("Stop 2 method is called");
    }


    public void addToCart()
    {
        System.out.println("Added To Cart");

    }

    public String getValue(int key)
    {
        return  mp.get(key);
    }

//    @Override
//    public void destroy() throws Exception {
//
//        System.out.println("Bean is getting Destroyed");
//
//    }


// Bean using init method
//        public void start()
//    {
//        System.out.println("Start method is called");
//        mp.put(1,"Aditya");
//        mp.put(2,"Rohit");
//    }

    // Bean using method destroy
//    public void stop()
//    {
//        System.out.println("Stop method is called");
//    }


//    @Override // type 1
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready");
//        mp.put(1,"Aditya");
//        mp.put(2,"Rohit");
//    }

    // typw e 2


}
