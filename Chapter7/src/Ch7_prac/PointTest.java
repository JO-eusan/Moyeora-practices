package Ch7_prac;

public class PointTest {

	public static void main(String[] args) {
		Point3D1 p3 = new Point3D1(1,2,3); // �����ڷ� ����
	}

}

class Point1 {
	int x, y;
	
	Point1 (int x, int y) { // ������
		this.x = x;
		this.y = y;
	}
	
	String getLocation() { // �޼���
		return "x: " + x + ", y: " + y;
	}
}

class Point3D1 extends Point1 {
	int z;
	
	Point3D1 (int x, int y, int z) { // ������
		super(x, y); // super�� �Ű����� ������ ���� ������ ���� ���� (Point Ŭ������ ������ Point(int x, int y)ȣ��
		// ������ ù �ٿ� �ٸ� �����ڸ� �������� ������  super(); �ڵ� ���� (super() = Point Ŭ������ ������)
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() { // �������̵�
		return "x: " + x + ",y: " + y + ",z: " + z;
	}
}
