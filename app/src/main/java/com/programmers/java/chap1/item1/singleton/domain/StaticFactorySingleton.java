package com.programmers.java.chap1.item1.singleton.domain;

public class StaticFactorySingleton {

    private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

    public StaticFactorySingleton getInstance() {
        return INSTANCE;
    }
    // 싱글턴임을 보장해주는 resolve 메서드
    private Object readResolve() {
        // NOTE : 진짜 'Elvis'를 반환하고, 가짜는 가비지 컬렉터에게 맏킨다.
        return INSTANCE;
    }

}
