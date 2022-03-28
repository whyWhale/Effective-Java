package com.programmers.java.item1.code.yeon.builder;

import static com.programmers.java.item1.code.yeon.builder.domain.NyPizza.Size.SMALL;
import static com.programmers.java.item1.code.yeon.builder.domain._abstract.Pizza.Topping.HAM;
import static com.programmers.java.item1.code.yeon.builder.domain._abstract.Pizza.Topping.ONION;
import static com.programmers.java.item1.code.yeon.builder.domain._abstract.Pizza.Topping.SAUSAGE;

import com.programmers.java.item1.code.yeon.builder.domain.Calzone;
import com.programmers.java.item1.code.yeon.builder.domain.NutritionFacts;
import com.programmers.java.item1.code.yeon.builder.domain.NyPizza;

public class Main {

    public static void main(String[] args) {
        NutritionFacts Cola = new NutritionFacts.Builder(240, 8)
            .calories(100).sodium(35).carbohydrate(30).build();

        // NOTE 계층적으로 설계된 클래스와 함께 쓰기 용이
        NyPizza pizza = new NyPizza.Builder(SMALL)
            .addTopping(SAUSAGE)
            .addTopping(ONION)
            .build();

        Calzone calzone = new Calzone.Builder()
            .addTopping(HAM)
            .sauceInside()
            .build();

        Integer a=100;
        trans(123123);
        System.out.println(a);

    }

    public static void trans(Integer input){

    }

}
