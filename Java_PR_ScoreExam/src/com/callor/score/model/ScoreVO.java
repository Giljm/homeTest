package com.callor.score.model;

public class ScoreVO {

	private int intNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intSum;
	private float intAvg;

	public int getIntNum() {
		return intNum;
	}

	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntMusic() {
		return intMusic;
	}

	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getIntAvg() {
		return intAvg;
	}

	public void setIntAvg(float intAvg) {
		this.intAvg = intAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO [intNum=" + intNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intMusic=" + intMusic + ", intSum=" + intSum + ", intAvg=" + intAvg + "]";
	}

}
