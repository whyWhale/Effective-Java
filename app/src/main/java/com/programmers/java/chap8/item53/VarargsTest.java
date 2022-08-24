package com.programmers.java.chap8.item53;

public class VarargsTest {
	public static int sum(int... args) {
		int sum = 0;

		for (int arg : args) {
			sum += arg;
		}

		return sum;
	}

	public static int getMinimumValueV1(int... args) {
		if (args.length == 0) {
			throw new RuntimeException("반드시 1개 이상의 인드수가 필요합니다.");
		}

		int min = args[0];

		for (int i = 1; i < args.length; i++) {
			min = Math.min(args[i], min);
		}

		return min;
	}

	public static int getMinimumValueV2(int firstArg, int... args) {
		int min = firstArg;

		for (int arg : args) {
			min = Math.min(min, arg);
		}

		return min;
	}

	public static void main(String[] args) {
		System.out.println(getMinimumValueV1(1, 2, 3, 4, 5));
		System.out.println(getMinimumValueV2(10, 1, 2, 3, 4, 5, 55, 0));
	}
}
