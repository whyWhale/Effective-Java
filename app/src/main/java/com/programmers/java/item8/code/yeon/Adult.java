package com.programmers.java.item8.code.yeon;

public class Adult {
	public static void main(String[] args) {
		try (Room myRoom=new Room(7)){
			System.out.println("hello !");
		}
	}
}
