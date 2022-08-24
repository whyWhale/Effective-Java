package com.programmers.java.chap1.item4.domain.factorymethod;

public class Programmer {
    private Tea tea;

    public Programmer(Tea tea) {
        this.tea = tea;
    }

    public void drink(){
        System.out.println(tea.drink());
    }
}
