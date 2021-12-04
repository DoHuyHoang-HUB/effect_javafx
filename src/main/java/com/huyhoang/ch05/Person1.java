package com.huyhoang.ch05;

import java.io.Serializable;

public class Person1 implements Serializable {
    private int age;
    private String name;

    public Person1(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
