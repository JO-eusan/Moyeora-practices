package Ch6_prac;

class Car1{
	String color; // ����
	String gearType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; // ���� ����
	
	Car1() {} // �Ű������� ���� ������
	Car1(String c, String g, int d) { // �Ű������� �ִ� ������
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car1 c1 = new Car1(); //�Ű������� ���� ������ �θ�
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car1 c2 = new Car1("white", "aute", 4); //�Ű������� �ִ� ������ �θ�
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		

	}

}
