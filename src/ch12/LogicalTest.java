package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) > 10) || ((i = i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// && 논리곱 (양쪽 항이 모두 true일때만 true) - 앞항이 false면 뒷항 연산안함
		// || 논리합 (두 항중 하나만 true면 true,둘다false면 false.) - 앞항이 true면 뒷항 연산안함.
		// ! 부정 (참이면 거짓, 거짓이면 참으로 결과를 바꿈)
		
	}

}
