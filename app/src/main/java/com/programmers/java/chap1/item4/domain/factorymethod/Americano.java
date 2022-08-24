package com.programmers.java.chap1.item4.domain.factorymethod;

public class Americano implements Tea {

    @Override
    public String drink() {
        return "아메리카노를 먹는다.";
    }

    @Override
    public int teaType() {
        return 1;
    }
}
