package school;

public class NetworkStudent extends Student{
	
	int kor;
	int eng;
	int linux; 
	int network; 
	int ccna; 
	
	public NetworkStudent() {
		kor = getRandomScore();
		eng = getRandomScore();
		linux = getRandomScore();
		network = getRandomScore();
		ccna = getRandomScore();
		subName = "Nework Management";
	}
	
	public void info() {
		System.out.println("#### Nework Management ####");
		System.out.printf("학번\t:%s\n", this.stuId);
		System.out.printf("이름\t:%s\n", name.getFullName());
		System.out.printf("국어\t:%d\n", kor);
		System.out.printf("영어\t:%d\n", eng);
		System.out.printf("리눅스\t:%d\n", linux);
		System.out.printf("네트워크\t:%d\n", network);
		System.out.printf("CCNA\t:%d\n", ccna);
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
		return kor + eng + linux + network + ccna;
	}
	
	public double getAvg() {
		return getTotal() / 5.0;
	}
}
