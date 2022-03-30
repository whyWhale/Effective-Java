package com.programmers.java.item4.code.yeon;

import com.programmers.java.item4.code.yeon.domain.factorymethod.Americano;
import com.programmers.java.item4.code.yeon.domain.factorymethod.Cappuccino;
import com.programmers.java.item4.code.yeon.domain.factorymethod.Programmer;
import com.programmers.java.item4.code.yeon.domain.factorymethod.Tea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private List<Tea> teas;

    public Main() {
        teas = List.of(new Americano(), new Cappuccino());
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        printMenuSelectionMessage();
        int select = Integer.parseInt(br.readLine());
        /**
         * what : 팩토리 메소드 패턴
         * result : 개발자는 메뉴를 선택함에 있어 동적으로 자원(아메리카노, 카푸치노)을 선택해서 주입받을 수 있게 되었다.
         */
        Tea tea = getTea(select, main.teas);
        Programmer programmer = new Programmer(tea);
        programmer.drink();

    }

    private static void printMenuSelectionMessage() {
        System.out.println("1번 아메리카노\n2번 카푸치노\n메뉴를 선택하세요.");
    }

    private static Tea getTea(int select, List<Tea> teas) {
        return teas.stream().filter(tea1 -> tea1.teaType() == select).findAny()
            .orElseThrow(() -> new RuntimeException("Error !"));
    }
}



