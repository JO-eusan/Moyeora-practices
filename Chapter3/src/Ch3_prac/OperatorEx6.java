package Ch3_prac;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b; ���� �߻� ��������� ����ȯ �ʿ�
		// ū �ڷ����� ���� ���� �ڷ����� ������ �����Ϸ��� ��������� ����ȯ �����ڸ� ���
		byte c = (byte)(a + b);
		System.out.println(c);

	}

}
