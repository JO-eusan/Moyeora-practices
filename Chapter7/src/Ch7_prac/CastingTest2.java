package Ch7_prac;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); // ���� ��ü ���� - Car car = new FireEngine();�� �����ϸ� ����� ���� �߻�X
		Car car2 = null; // ���� ��ü ����2
		FireEngine fe = null; // �ڼ� ��ü ����

		car.drive();
		fe = (FireEngine)car; // ���� Ÿ�Կ��� �ڼ�Ÿ������ ����ȯ (�������� OK, ���� �� ���� �߻� - ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����ϴ� ���� ���X)
		fe.drive();
		car2 = fe; // �ڼ�Ÿ�Կ��� ����Ÿ������ ����ȯ
		car2.drive();
	}

}
