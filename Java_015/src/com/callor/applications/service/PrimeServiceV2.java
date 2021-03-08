package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime(int intNum) {

		int index = 0;
		for (index = 2; index < intNum; index++) {
			if (intNum % index == 0) {

				return -1;
			}
		}
		return intNum;
	}
}
