package Ch5_prac;

public class ArrayEx10 {

	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10)); // 0~9 �� �ֱ�
		}
		System.out.println();
		
		for (int i=0; i < numArr.length-1; i++) {
			boolean changed = false; // �ڸ��ٲ��� �߻��ߴ��� üũ
			
			for (int j=0; j < numArr.length-1; j++) {
				if (numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; // �ڸ��ٲ��� �߻��ϹǷ� true
				}
			}
			
			if (!changed) break; // �ڸ��ٲ��� ������ �ݺ����� �����.
			
			for (int k=0; k < numArr.length; k++) {
				System.out.print(numArr[k]); // ���ĵ� ����� ���
			}
			System.out.println();
		}
	}

}
