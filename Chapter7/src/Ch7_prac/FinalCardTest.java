package Ch7_prac;

class Cards { // ī�� ���� Ŭ����
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Cards(String kind, int number) { // �Ű������� �Ѱܹ��� ������ �ʱ�ȭ
		KIND = kind;
		NUMBER = number;
	}
	
	Cards() {
		this("HEART", 1); // �⺻��
	}
	
	public String toString() {
		return KIND + " " + NUMBER; // ��� toString()�޼���
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Cards c = new Cards("Heart", 10);
		// c.NUMBER = 5; ���� �߻�, ����� ���� �Ұ���
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // c.toString()�� ���� �ǹ�
	}

}
