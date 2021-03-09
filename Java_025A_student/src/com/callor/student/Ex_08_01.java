package com.callor.student;

import java.util.Random;

public class Ex_08_01 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// 여기 코드는 i 반복횟수 * j 반복횟수 만큼
				// 반복이 된다.
			}
		}

		int intPrimeSum = 0;
		int intPrimeCount = 0;

		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int rndNum = rnd.nextInt(100) + 2;

			// 생성된 난수(rndNum)값이 소수인지 검사
			int index = 0;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}
			}
			if (index < rndNum) {
				System.out.println(rndNum + "는 소수 아님");
			} else {
				System.out.println(rndNum + "는 소수");
				intPrimeSum += rndNum;
				intPrimeCount++;
			}
		} // for i end

		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);

	}

}
