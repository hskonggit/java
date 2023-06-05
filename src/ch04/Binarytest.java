package ch04;

public class Binarytest {

	public static void main(String[] args) {
		int num = 10; //int(정수형)는 num(변수)에 대한 Date Type에 대한 정의. num은 변수명.
		int bNum = 0B1010; //2진수는 0B를 식별자로 씀
		int oNum = 012;	//8진수는 0을 식별자로 씀
		int xNum = 0XA; //16진수는 0X를 식별자로 씀
		
		// 변수 (variable) 는 데이터값을 담는 메모리공간. 변수는 바뀔수 있다.
		// 변수명 생성규칙
		// 1. 영문자(대소문자), 숫자, 언더스코어(_), 달러($)로만 구성가능.
		// 2. 숫자로 시작불가.
		// 3. 변수명 사이에는 공백 사용불가.
		// 4. 자바에서 미리 정의된 키워드(keyword)는 사용불가.
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
	}

}
