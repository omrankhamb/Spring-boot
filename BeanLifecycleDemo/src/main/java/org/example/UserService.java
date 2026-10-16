package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component("userBean")
public class UserService implements BeanNameAware, ApplicationContextAware{

    public UserService(){
            System.out.println("UserService constructor Called");
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println("Bean name is : " +name);
    }

    //


    public String getBean(BeanNameAware bean){
        return "userBean";
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
        throws BeansException {
        System.out.println("ApplicationContextAware naem " + applicationContext.getClass());
    }

 }
