package Ch6_prac;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);

	}
	
	static int factorial(int n) {
		int result = 0; // ������ �ʱ�ȭ
		if(n==1) {
			result = 1; // �޼��� Ż��
		}
		else {
			result = n * factorial(n-1); /// �ٽ� �޼��� �ڽ��� ȣ��
		}
		return result;
	}

}
