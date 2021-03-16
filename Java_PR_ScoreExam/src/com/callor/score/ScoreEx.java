package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV1();

		ssV1.inputScoreName();
		ssV1.inputscore();
		ssV1.totalAndAvgScore();
		ssV1.saveFileScore();
		ssV1.printFileScore();

	}

}
