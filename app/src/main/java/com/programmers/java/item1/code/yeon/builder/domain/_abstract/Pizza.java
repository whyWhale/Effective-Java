package com.programmers.java.item1.code.yeon.builder.domain._abstract;

import java.util.*;

public abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    // 추상 클래스는 추상 Builder를 가진다. 서브 클래스에서 이를 구체 Builder로 구현한다.
    protected abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract Pizza build();

        // 하위 클래스는 이 메서드를 overriding하여 this를 반환하도록 해야 한다.
        protected abstract T self();
    }

    protected Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}

