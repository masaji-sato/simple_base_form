package com.example.model;

import javax.validation.Valid;

public class A {

    @Valid
    private B b = new B();

    public A() {
        System.out.println("a");
    }

    public B getB() {
        return b;
    }
}
