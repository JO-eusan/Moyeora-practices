package Ch5_prac;

public class ArrayEx5 {

	public static void main(String[] args) {
		int sum = 0; // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����
		
		int [] score = {100, 88, 100, 100, 90};
		
		for (int i=0; i < score.length; i++) {
			sum += score[i]; // �ݺ����� �̿��� �迭�� ����Ǿ� �ִ� ������ ��� ���Ѵ�.
		}
		
		average = sum / (float)score.length; // ������� floatŸ������ ������� ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}

}