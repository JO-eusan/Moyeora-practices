package Ch6_prac;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);

	}
	
	static int factorial(int n) {
		int result = 0; // 최종값 초기화
		if(n==1) {
			result = 1; // 메서드 탈출
		}
		else {
			result = n * factorial(n-1); /// 다시 메서드 자신을 호출
		}
		return result;
	}

}
