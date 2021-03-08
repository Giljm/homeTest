package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int[] intNum = new int[100];
		int index = 0;
		for (index = 0; index < intNum.length; index++) {
			intNum[index] = rnd.nextInt(150) + 2;
		} // 랜덤 2 ~ 150의 값을 intNum 0 ~ 99에 담음.
		// 임의의 정수 100개 생성.

		int[] result = new int[100];
		for (index = 0; index < intNum.length; index++) {
			result[index] = psV2.prime(intNum[index]);
		} // psV2의 prime() method의 결과를 result 0 ~ 99에 담음.
		// 임의의 소수와 소수가 아닌 -1을 생성.

		for (index = 0; index < intNum.length; index++) {
			if (result[index] < 0) {
				// prime() method에서 나온 -1이라는 결과의 출력을 걸러줌.
			} else {
				System.out.printf("%d은(는) 소수다\n", result[index]);
				// 소수 들만 걸러서 출력.
			}
		}
		int sum = 0;
		for (index = 0; index < intNum.length; index++) {
			if (result[index] < 0) {
				// prime() method에서 나온 -1이라는 결과의 출력을 걸러줌.
			} else {
				sum += result[index];
				// prime() method에서 나온 소수들만 누적해서 더함.
			}

		}
		System.out.println("=====================");
		System.out.println("소수들의 합 : " + sum);
	}
}