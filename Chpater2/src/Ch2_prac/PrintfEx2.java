package Ch2_prac;

public class PrintfEx2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f; //0.10
		float f2 = 1e1f; // 10.0
		float f3 = 3.14e3f; // 3140.0
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1); // 각각 부동 소수점, 지수, 간략한 형태로 표현
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d = %f%n", d);
		System.out.printf("d = %14.10f%n", d); // 전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
	}

}
