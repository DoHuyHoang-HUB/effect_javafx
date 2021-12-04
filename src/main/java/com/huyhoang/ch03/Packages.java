package com.huyhoang.ch03;

import com.huyhoang.ch02.StaticMembers;
import com.huyhoang.ch02.hiding.C;
import com.huyhoang.ch02.hiding.D;

import static com.huyhoang.ch02.StaticMembers.SomeClass.someMethod;
import static com.huyhoang.ch02.StaticMembers.SomeClass.SOME_PROPERTY;

public class Packages {
    public static void main(String... args){
        C c = new C();
        D d = new D();

        StaticMembers.SomeClass obj = new StaticMembers.SomeClass();
        someMethod(42);
        System.out.println(SOME_PROPERTY);    //prints: abc
    }
}


