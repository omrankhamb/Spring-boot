package org.example.simple;

public class B {

    private A a;

    public B () {
        System.out.println("B constructor");
        this.a = new A();
    }
}
