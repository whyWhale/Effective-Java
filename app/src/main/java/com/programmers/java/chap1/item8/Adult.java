package com.programmers.java.chap1.item8;

public class Adult {
	public static void main(String[] args) {
		try (Room myRoom=new Room(7)){
			System.out.println("hello !");
		}
	}
}
