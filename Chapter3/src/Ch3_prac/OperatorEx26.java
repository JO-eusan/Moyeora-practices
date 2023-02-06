package Ch3_prac;

public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b !=0); // 효율적인 연산을 통해 OR의 뒷부분 연산X
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 || ++b !=0);
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
