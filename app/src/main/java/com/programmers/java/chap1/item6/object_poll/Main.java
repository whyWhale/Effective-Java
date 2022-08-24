package com.programmers.java.chap1.item6.object_poll;

public class Main {

    public static void main(String[] args) {
        SampleObjectPool<StringBuffer> pool = new SampleObjectPool<StringBuffer>(StringBuffer.class, 10);
        try {
            StringBuffer object1 = pool.borrowObject();
            StringBuffer object2 = new StringBuffer();
            System.out.println(pool.isValidateObject(object1));
            System.out.println(pool.isValidateObject(object2));
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
