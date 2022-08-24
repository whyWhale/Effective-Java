package com.programmers.java.chap1.item4.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * what : 생성자에 자원 팩터리를 넘겨주는 방식 (팩토리 메서드 패턴)
 *  팩터리 = 호출할 때마다 특정 타입의 인스턴스를 반복해서 만들어주는 객체 (팩터리 메서드 패턴)
 *  Supplier<T> 인터페이스: 팩터리를 표현함
 *  한정적 와일드 카드 타입 (bounded wildcard type)으로 팩터리 타입 매개변수를 제한한다. (TypeFactory.class)
 *
 * how : Type의 하위타입이어도 map에 put이 가능하다. (리스코프의 치환원칙)
 */
public class Itype {

    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;

    final static Map<Integer, Supplier<? extends TypeFactory>> map = new HashMap<>();

    static {
        map.put(A, TypeFactory::new);
        map.put(B, A::new);
        map.put(C, B::new);
    }
}



