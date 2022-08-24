package com.programmers.java.chap1.item4.domain.factorymethod;

public class Cappuccino implements Tea{

    @Override
    public String drink() {
        return "카푸치노를 먹는다.";
    }

    @Override
    public int teaType() {
        return 2;
    }
}
