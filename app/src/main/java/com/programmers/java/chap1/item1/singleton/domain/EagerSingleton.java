package com.programmers.java.chap1.item1.singleton.domain;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public void test() {
        System.out.println("test");
    }

}
