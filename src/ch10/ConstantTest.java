package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100; //변하지않는 값 (상수) 표현할때 선언시 final 로 선언.
		final int MIN_NUM = 0;
		//MIN_NUM = 0;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
