package Ch3_prac;
import java.util.*;
public class OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ȭ�鿡�� �Է¹ޱ�
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ��� >");
		
		String input = scanner.nextLine(); // �Է¹ް� input ������ ����
		ch = input.charAt(0); // ���ڿ��� 0��° ���� �о ch�� ����
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
		
		scanner.close();
	}

}
