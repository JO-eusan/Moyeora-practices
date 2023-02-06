package Ch3_prac;
import java.util.*;
public class OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 화면에서 입력받기
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요 >");
		
		String input = scanner.nextLine(); // 입력받고 input 변수에 저장
		ch = input.charAt(0); // 문자열의 0번째 문자 읽어서 ch에 저장
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		
		scanner.close();
	}

}
