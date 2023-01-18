package Ch3_prac;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b; 에러 발생 명시적으로 형변환 필요
		// 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용
		byte c = (byte)(a + b);
		System.out.println(c);

	}

}
