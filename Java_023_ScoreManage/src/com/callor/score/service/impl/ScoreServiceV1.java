package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceV1 implements ScoreService {

	private List<String> scoreString; // 선언만
	private List<ScoreVO> scoreList;
	private String fileName; // 문자형 선언만

	public ScoreServiceV1() { // 생성자 메서드
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
		// 생성 및 초기화

	}

	// Random 값들 생성하여 저장
	public void makeScore() {
		Random rnd = new Random();

		for (int i = 0; i < 20; i++) { // 20명의 학생이기에 20번 반복

			ScoreVO scoreVO = new ScoreVO(); // Score VO 선언 및 생성
			scoreVO.setKor(rnd.nextInt()); // ScoreVO의 set에 랜덤수 저장
			scoreVO.setEng(rnd.nextInt());
			scoreVO.setMath(rnd.nextInt());
			scoreVO.setMusic(rnd.nextInt());
			scoreVO.setHistory(rnd.nextInt());

			scoreList.add(scoreVO); // scoreList에 scoreVO값을 담음

		} // end for

	} // end makeScore

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub

	}

}
