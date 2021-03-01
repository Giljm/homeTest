package com.callor.opp.controller;

import java.util.Random;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		CartVO cartVO[] = new CartVO[3];

		System.out.print("유저 이름 입력 >> ");
		String userName1 = scan.nextLine();
		cartVO[0].setCartUserName(userName1);

		System.out.print("날짜 입력 >> ");
		String cartDate1 = scan.nextLine();
		cartVO[0].setCartDate(cartDate1);				

		System.out.print("시간 입력 >> ");
		String cartTime1 = scan.nextLine();
		cartVO[0].setCartTime(cartTime1);

		System.out.print("상품명 입력 >> ");
		String cartPName1 = scan.nextLine();
		cartVO[0].setCartPName(cartPName1);

		int qty1 = rnd.nextInt();
		cartVO[0].setCartQty(qty1);

		System.out.print("상품명 입력 >> ");
		String cartStd1 = scan.nextLine();
		cartVO[0].setCartStd(cartStd1);

		int carrPrice1 = rnd.nextInt();
		cartVO[0].setCartPrice(carrPrice1);

		System.out.println();

//		cartVO[0].setCartTotal(1000 * 10);
//
//		System.out.println(cartVO.toString());

	}

}
