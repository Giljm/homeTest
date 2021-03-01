package com.callor.opp.controller;

import com.callor.opp.model.CartVO;

/*
 * Controller 클래스
 * java project에서 Controller 접미사가 붙어있는 클래스는
 * 보통 프로젝트의 시작 부분으로 사용된다.
 */

public class CartControllerV1 {

	public static void main(String[] args) {

		// set으로 입력
		// 이런식으로 저장해서 불러오는 것을 VO 클래스라고 한다.
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartDate("2021-02-26");
		cartVO.setCartTime("10:400:00");
		cartVO.setCartPName("초코파이");
		cartVO.setCartQty(10);
		cartVO.setCartStd("바나나맛");
		cartVO.setCartPrice(1000);
		cartVO.setCartTotal(1000 * 10);

		System.out.println(cartVO.toString());

	}

}
