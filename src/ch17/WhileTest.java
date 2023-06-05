package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num; //증가된 num을 sum에 더해라.
			num++; //num을 1씩증가
			
		}
		System.out.println(sum);
		System.out.println(num);
		
	}

}
