package com.callor.applications;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 >> ");
		int num = scan.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + "는 소수다");
				break;
			} else {
				System.out.println("소수가 아니다");
			}
		}
	}
}
