package com.programmers.java.item1.code.yeon.singleton.domain;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public void test() {
        System.out.println("test");
    }

}
