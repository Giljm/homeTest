package com.callor.opp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartServiceV1 {

	Scanner scan = new Scanner(System.in);

	// 1. CartServiceV1 클래스에 cartList 객체를 인스턴스변수로 선언
	private List<CartVO> cartList = new ArrayList<CartVO>();
	private CartVO cartVO;

	// 2. inputCart() method를 선언하고
	public void inputCart() {

		System.out.println("제품 정보를 입력하세요");
		System.out.println("----------------------");

		cartVO = new CartVO();

		System.out.println("제품명 입력");
		System.out.print("제품명 >> ");
		String strPName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.println("수량 입력");
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			intQty = Integer.valueOf(strQty);
			try {
				if (intQty < 2) {
					System.out.println("수량은 2개 이상만 입력하세요!");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량에는 숫자만 입력하세요!");
			} // end catch
		} // end while

		int intPrice = 0;
		while (true) {
			System.out.println("가격 입력");
			System.out.print("가격 >> ");
			String strPrice = scan.nextLine();
			intPrice = Integer.valueOf(strPrice);
			try {
				if (intPrice < 1000) {
					System.out.println("가격은 1000원 이상만 입력하세요.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("가격에는 숫자만 입력하세요!");
			} // end catch
		} // end while

		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);

		cartList.add(cartVO);
	} // end inputCart() method

	public void printcartList() {
		int size = cartList.size();
		for (int i = 0; i < size; i++) {
			System.out.println("제품명\t수량\t가격\t");
			System.out.printf("%s\t", cartList.get(i).getCartPName());
			System.out.printf("%d개\t", cartList.get(i).getCartQty());
			System.out.printf("%d원\t", cartList.get(i).getCartPrice());

		} // end for
	} // end printcartList() method
}
