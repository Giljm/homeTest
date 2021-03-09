package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여
 * 10 ~ 100 까지 임의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서 
 * Console에 출력
 * 
 */
public class Ex_08 {

	public static void main(String[] args) {

		int num[] = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 10;

			int index = 0;
			for (index = 2; index < num[i]; index++) {
				if (num[i] % index == 0) {
					break;
				}
			}

			System.out.println(num[i]);
			
		}

	}

}
