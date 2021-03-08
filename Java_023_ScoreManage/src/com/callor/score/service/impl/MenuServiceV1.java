package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceV1 implements MenuService {

	@Override
	public Integer selectMenu() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("============================");
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println("----------------------------");
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println("============================");
			System.out.print("선택 >>");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) { // "QUIT" 를 입력하게 되면 멈춤.
				break;
			}

			Integer intMenu = null;

			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("선택한 값만 입력");
				continue;
			}

			if (intMenu >= 1 && intMenu <= 3) {
				return intMenu;
			} else {
				System.out.println("선택한 값만 입력");
			}

		}
		return null;

	}

}
