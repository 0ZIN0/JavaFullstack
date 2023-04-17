package school;

public class machineLearningStudent extends Student{
	int kor;
	int eng;
	int math;
	int statistics; 
	int pl;
	int noSql;
	
	public machineLearningStudent() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		pl = getRandomScore();
		statistics = getRandomScore();
		noSql = getRandomScore();
		subName = "Machine Learning";
	}
	
	@Override
	public void info() {
		System.out.println("#### machine Learning ####");
		System.out.printf("학번\t:%s\n", this.stuId);
		System.out.printf("이름\t:%s\n", name.getFullName());
		System.out.printf("국어\t:%d\n", kor);
		System.out.printf("영어\t:%d\n", eng);
		System.out.printf("수학\t:%d\n", math);
		System.out.printf("통계학\t:%d\n", statistics);
		System.out.printf("PL\t:%d\n", pl);
		System.out.printf("NO-SQL\t:%d\n", noSql);
		System.out.printf("총합\t:%d\n", getTotal());
		System.out.printf("평균\t:%.2f\n", getAvg());
		System.out.printf("등급\t:%c\n", getGrade());
	}
	
	public char getGrade() {
		double avg = getAvg();
		
		if(avg >=90) {
			return 'A';
		} else if(avg >= 80) {
			return 'B';
		} else if(avg >= 70) {
			return 'C';
		} else if(avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public int getTotal() {
		return kor + eng + math + statistics + pl + noSql;
	}
	
	public double getAvg() {
		return getTotal() / 6.0;
	}
}
