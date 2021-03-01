package com.callor.opp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {

	public static void main(String[] args) {

		// java 프로젝트에서 List 객체를 생성하기
		// List클래스를 사용하여 객체를 선언하고
		// ArrayList() 생성자를 호출하여
		// 객체를 초기화 한다.
		List<String> strList1 = new ArrayList<String>();
		// Java에서 적극 권장하는 방법
		// 쓸 수 있게 준비해준다.

		List<Integer> intList; // 현 상태는 사용할 준비가 안됨.
		intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();

		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
		// intArrayList = new LinkedList<Integer>();
		// intArrayList = new Vector<Integer>()

		// int[] num = new int[3];
		// num = float[3];
		// 정수형 배열을 실수형 배열로 바꾸고 싶지만 불가능하다.

	}

}
