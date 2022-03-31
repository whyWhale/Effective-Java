package com.programmers.java.item4.code.yeon.domain.factorymethod;

public class Programmer {
    private Tea tea;

    public Programmer(Tea tea) {
        this.tea = tea;
    }

    public void drink(){
        System.out.println(tea.drink());
    }
}
