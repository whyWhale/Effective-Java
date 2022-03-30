package com.programmers.java.item4.code.yeon.domain.factorymethod;

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
