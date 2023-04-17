package myobj;

import java.util.Arrays;

public class ProgrammingClass {
	
	int[] scores;
	int totalScore;
	double avg;
	String grade;
	String[] subjects;
	
	public ProgrammingClass() {
		scores = new int[6];
		subjects = new String[] {"국어", "영어", " 수학", "프로그래밍 언어", "운영체제", "자료구조"};
		
		randomScoregen();
	}
	
	public void getScores() {
		System.out.println(Arrays.toString(scores));
	}
	
	public void randomScoregen() {
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random()* 101);
		}
	}
	
	public void getSubjectScore() {
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%s: %d ", subjects[i], scores[i]);
		}
	}
	
	public int totalScore() {
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore;
	}
	
	public double avg() {
		avg = totalScore / (scores.length * 1.0); 
		return avg;
	}
	
	public String grade() {
		
		if(avg > 95) {
			grade = "A+";
		} else if(avg > 90) {
			grade = "A";
		} else if(avg > 85) {
			grade = "B+";
		} else if(avg > 80) {
			grade = "B";
		} else if(avg > 75) {
			grade = "C+";
		} else if(avg > 70) {
			grade = "C";
		} else if(avg > 65) {
			grade = "D+";
		} else if(avg > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	@Override
	public String toString() {
		
		return String.format("/총점: %d/평균: %f/등급: %s", totalScore(), avg(), grade());
	}
}
