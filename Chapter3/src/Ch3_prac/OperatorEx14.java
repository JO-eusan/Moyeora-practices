package Ch3_prac;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		for (int i=0; i<26; i++) { // 26번 반복
			System.out.print(c++); // a부터 26개 문자 출력
		}
		System.out.println();
		
		c = 'A';
		for (int i=0; i<26; i++) { // 26번 반복
			System.out.print(c++); // A부터 26개 문자 출력
		}
		System.out.println();
		
		c = '0';
		for (int i=0; i<10; i++) { // 10번 반복
			System.out.print(c++); // 0부터 10개의 문자 출력
		}
		System.out.println();
	}

}
