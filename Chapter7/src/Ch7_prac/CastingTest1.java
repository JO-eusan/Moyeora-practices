package Ch7_prac;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;���� �ڼ�Ŭ������ ����Ŭ������ ����ȯ�ϱ� ������ ���� ����
//		car.water(); car�� �ڼ� Ŭ�������� �����ϴ� �޼��带 ����� �� ����.
		fe2 = (FireEngine)car; // ����Ÿ�Կ��� �ڼ�Ÿ�������� ����ȯ�̱� ������ ���� �Ұ���
		fe2.water();
	}

}

class Car {
	String color; // ��
	int door; // ���� ����
	
	void drive() { // �����ϴ� ���
		System.out.println("drive, Brrrrr~");
	}
	void stop() { // ���ߴ� ���
		System.out.println("Stop!!!");
	}
}
class FireEngine extends Car { // �ҹ���
	void water() { // ���� �Ѹ��� ���
		System.out.println("Water!!!");
	}
}
