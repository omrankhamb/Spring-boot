package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


// Bean name is aware Inteface is only method to find out the bean name and we can not change the bean name
// THese is call Back Method which is called by the spring
// setBeanname setApplicatioContext are the aware interface
// Similary the Application Context also present for the aware interface
@Component
public class UserService implements BeanNameAware {

    public UserService()
    {
        System.out.println("Constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : " + name);
    }
}
