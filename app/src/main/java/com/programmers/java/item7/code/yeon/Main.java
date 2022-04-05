package com.programmers.java.item7.code.yeon;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static List<Double> list = new LinkedList<>();
    Stack<Integer> s;

    private void gogo() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.gc();
    }

    public static void main(String[] args) {
        new Main().gogo();


    }
}
