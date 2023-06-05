package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A'; //char은 문자형 2byte 유니코드, 음수는 사용X, 싱글쿼터 '' 사용.
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch = '\uACF5';
		System.out.println(ch);
		
		
	}

}
