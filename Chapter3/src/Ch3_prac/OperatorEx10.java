package Ch3_prac;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // �����÷ο� �߻�
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}

}
