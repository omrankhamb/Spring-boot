package org.example;

import org.example.Payment.PaymentService;

import java.util.List;

public class UserService {
//
//    private List<String> username;
//
//    public UserService(List<String> username) {
//        this.username = username;
//        System.out.println("User Service Created");
//    }
//
//    public List<String> getUsername() {
//        return username;
//    }

    public UserService() {
        System.out.println("UserService created");
    }

    public void init(){
        System.out.println("Post Construct Phase");
    }

    public void cleanup()
    {
        System.out.println("UserService cleanup");
    }

}
