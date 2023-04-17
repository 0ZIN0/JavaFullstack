package myobj2;

public class Descend extends AbstractQuiz{

	@Override
	public int[] answer1(int[] data) {
		
		for(int i = 0; i < data.length; i++) {
			for(int j = i; j < data.length; j++) {
				if(data[i] < data[j]) {
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}						
			}
		}
		return data;
	}
}
