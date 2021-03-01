package com.callor.opp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartControllerV2_2_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<CartVO> cartList = new ArrayList<CartVO>();

		CartVO cartVO = new CartVO();

		for (int i = 0; i < 3; i++) {

			System.out.println("구매자 성명");
			System.out.print("구매자 >> ");
			String userName1 = scan.nextLine();
			cartVO.setCartUserName(userName1);

			System.out.println("제품 이름");
			System.out.print("제품 >> ");
			String pName1 = scan.nextLine();
			cartVO.setCartPName(pName1);

			System.out.println("제품 수량");
			System.out.print("수량 >> ");
			String qty1 = scan.nextLine();
			int qty1_1 = Integer.valueOf(qty1);
			cartVO.setCartQty(qty1_1);

			System.out.println("제품 가격");
			System.out.print("가격 >> ");
			String price1 = scan.nextLine();
			int price1_1 = Integer.valueOf(price1);
			cartVO.setCartPrice(price1_1);

			cartList.add(cartVO); // 위에 입력된 정보를 cartList에 담음

		} // for end

		System.out.println("=============================");
		System.out.println("장바구니");
		System.out.println("-----------------------------");

		for (int i = 0; i < 3; i++) {

			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", cartVO.getCartUserName(), cartVO.getCartPName(),
					cartVO.getCartPrice(), cartVO.getCartQty());

		} // for end
	}

}
