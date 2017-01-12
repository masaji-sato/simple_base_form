package com.example.model;

import javax.validation.constraints.Size;

public class C {

    @Size(min = 3)
    private String value = "c";

    public C() {
        System.out.println("c");
    }

    public String getValue() {
        return value;
    }
}
