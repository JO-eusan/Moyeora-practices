package Ch5_prac;

public class ArrayEx7 {

	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ
			System.out.print(numArr[i]);
		}
		System.out.println(); // �ٹٲ�
		 for (int i=0; i < 100; i++) {
			 int n = (int)(Math.random()*10); // 0~9 �� ������ �Ѱ��� ��´�.
			 int tmp = numArr[0];
			 numArr[0] = numArr[n];
			 numArr[n] = tmp; // 0��°�� n��°�� ���� ���� �ٲ۴�.
		 }
		 
		 for (int i=0; i < numArr.length; i++) {
			 System.out.print(numArr[i]);
		 }
		

	}
}
