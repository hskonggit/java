package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bnum = -128;
		//byte 자료형은 1byte(8bit)
		//맨앞 1bit자리는 부호비트로, 음수or양수 표현 
		//so, 7bit자리수만큼 -2^7 ~ 2^7-1 수를 표현 가능 
		// -128 ~ 127까지. 
		System.out.println(bnum);
		
		//int num = 123456787900;  에러 int 자료형은 4byte임.리터럴이 4byte를 초과.
		//long lNum = 12345678900; 에러 자바 기본 정수자료형은 int로 4byte임.
		long LongNum = 12345678900L; // so, long 자료형을 쓰려면 숫자뒤에 l or L을 붙여야함.
		
		System.out.println(LongNum);
		
		
	}

}
