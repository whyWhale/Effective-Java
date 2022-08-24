package com.programmers.java.chap1.item6;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String A = new String("A");
                    Thread.sleep(500);
                }
            } catch (Exception exception) {
                exception.getStackTrace();
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    public void say() {
        System.out.println("hello, world");
    }

}
