package com.callor.opp.controller;

import com.callor.opp.model.CartVO;

public class CartControllerV2_2 {

	public static void main(String[] args) {

		CartVO cartVO[] = new CartVO[3];

		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartQty(10);

		System.out.println(cartVO.toString());

		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("홍길동");
		cartVO[1].setCartPName("초코파이");
		cartVO[1].setCartPrice(1000);
		cartVO[1].setCartQty(10);

		System.out.println(cartVO.toString());

		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("홍길동");
		cartVO[2].setCartPName("초코파이");
		cartVO[2].setCartPrice(1000);
		cartVO[2].setCartQty(10);

		System.out.println(cartVO[0].toString());
		System.out.println(cartVO[1].toString());
		System.out.println(cartVO[2].toString());

		// === cartVO의 개수가 3개인 상태
		// 상품 한 가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4];
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");

		System.out.println("=======================");
		System.out.println("카트 내용");
		System.out.println("-----------------------");
		for (int i = 0; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());

		}

	}

}
