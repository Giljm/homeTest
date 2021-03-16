package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreList;
	private String fileName;

	private String[] strMenu;
	private Scanner scan;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/data/저장.txt";

		strMenu = new String[4];
		scan = new Scanner(System.in);

	} // end ScoreServiceImplV1

	@Override
	public void inputScoreName() {

		for (int i = 0; i < strMenu.length; i++) {

			System.out.print("과목명 입력 >> ");
			String strSub = scan.nextLine();

			strMenu[i] = strSub;

		} // end for

		System.out.println("과목 입력 완료");

	} // end inputScoreName

	@Override
	public void inputscore() {

		System.out.print("학생수 입력 >>");
		int people = scan.nextInt();

		int intKor = 0;

		ScoreVO scoreVO = new ScoreVO();

		for (int i = 0; i < people; i++) {
			System.out.print("학번 입력 >>");
			int intNum = scan.nextInt();
			scoreVO.setIntNum(intNum);

			while (true) {
				System.out.print("국어 입력 >>");
				intKor = scan.nextInt();
				try {
					scoreVO.setIntKor(intKor);
				} catch (Exception e) {
					System.out.println("숫자만 입력가능");
				}
				if (intKor >= 0 && intKor <= 100) {
					break;
				} else {
					System.out.println("1부터 100만 입력가능");
				}
			}

			while (true) {
				System.out.print("영어 입력 >>");
				int intEng = scan.nextInt();
				try {
					scoreVO.setIntEng(intEng);
				} catch (Exception e) {
					System.out.println("숫자만 입력가능");
				}
				if (intEng >= 0 && intEng <= 100) {
					break;
				} else {
					System.out.println("1부터 100만 입력가능");
				}
			}

			while (true) {
				System.out.print("수학 입력 >>");
				int intMath = scan.nextInt();
				try {
					scoreVO.setIntMath(intMath);
				} catch (Exception e) {
					System.out.println("숫자만 입력가능");
				}
				if (intMath >= 0 && intMath <= 100) {
					break;
				} else {
					System.out.println("1부터 100만 입력가능");
				}
			}

			while (true) {
				System.out.print("음악 입력 >>");
				int intMusic = scan.nextInt();
				try {
					scoreVO.setIntMusic(intMusic);
				} catch (Exception e) {
					System.out.println("숫자만 입력가능");
				}
				if (intMusic >= 0 && intMusic <= 100) {
					break;
				} else {
					System.out.println("1부터 100만 입력가능");
				}
			}

			scoreList.add(scoreVO);
		}
	} // end inputscore

	@Override
	public void totalAndAvgScore() {
		// TODO Auto-generated method stub

		for (ScoreVO vo : scoreList) {
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();

			float avg = (float) sum / 5;
			vo.setIntSum(sum);
			vo.setIntAvg(avg);

		}

	}

	@Override
	public void saveFileScore() {
		// TODO Auto-generated method stub

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);

			printWriter.println(Values.dLine(70));
			printWriter.println("성적알림표");
			printWriter.println(Values.dLine(70));
			printWriter.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
			printWriter.println(Values.sLine(70));

			for (ScoreVO vo : scoreList) {

				printWriter.print(vo.getIntNum() + "\t\t");
				printWriter.print(vo.getIntKor() + "\t\t");
				printWriter.print(vo.getIntEng() + "\t\t");
				printWriter.print(vo.getIntMath() + "\t\t");
				printWriter.print(vo.getIntMusic() + "\t\t");
				printWriter.print(vo.getIntSum() + "\t\t");
				printWriter.print(vo.getIntAvg() + "\n");
			}

			printWriter.close();
			fileWriter.close();

			System.out.println("\n파일 저장\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	} // end saveFileScore

	@Override
	public void printFileScore() {
		// TODO Auto-generated method stub
		// 출력전 총점 평균 계산
		this.totalAndAvgScore();

		System.out.println(Values.dLine(70));
		System.out.println("성적알림표");
		System.out.println(Values.dLine(70));
		System.out.println("학번\t" + strMenu[0] + "\t" + strMenu[1] + "\t" + strMenu[2] + "\t" + strMenu[3] + "\t" + "\t"
				+ "\t총점\t평균");
		System.out.println(Values.sLine(70));

		for (ScoreVO vo : scoreList) {

			System.out.print(vo.getIntNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntMusic() + "\t");

			System.out.print(vo.getIntSum() + "\t");
			System.out.printf("%3.2f\t\n", vo.getIntAvg());

		}

		ScoreVO scoreVO = new ScoreVO();
		System.out.println(Values.sLine(70));
		System.out.println("총점 : " + scoreVO.getIntSum() + "\t");
		System.out.printf("평균 : %3.2f\t\n", scoreVO.getIntAvg());

	} // end printFileScore

}
