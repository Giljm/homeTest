package com.callor.opp.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {

			// 제목보이기
			System.out.println("========================");
			System.out.println("쇼핑카트 상품추가");
			System.out.println("------------------------");

			// 입력받기
			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();

			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);

			System.out.print("가격 >> ");
			String strPrice = scan.nextLine();
			int intPrice = Integer.valueOf(strPrice);

			// 카트 정보 생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);

			// 카트정보 리스트에 추가하기
			cartList.add(cartVO);

		} // end for

		System.out.println("========================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("------------------------");

		// int[] intName = new int[5]; (예시)
		// 배열에서는 배열.length 값을 참조하면
		// 배열의 개수를 알 수 있었다.
		// 처음에 만들때 개수가 정해지지 않음.
		// 리스트를 계속 추가 필요 없어지면 제거.
		// 참조할 값이 없음, 리스트의 개수가 유동성이라 어떠한 변수에 담아 사용하기가 어려움
		// 그래서 size() method를 호출, list에 담겨있는 개수를 세는 코드가 실행.
		// List 에서는 list.size() method를 호출하면
		// list 개수를 return 해준다

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(), cartList.get(i).getCartQty());

		} // end for
		System.out.println("=======================================");
	}
}
