package Ch6_prac;

class Car2 {
	String color; //����
	String gearType; //���ӱ� ����
	int door; //���� ����
	
	Car2() { //������1
		this("white", "auto", 4); //������3 ȣ��
	}
	
	Car2(String color) { //������2
		this(color, "auto", 4); //������3 ȣ��
	}
	Car2(String color, String gearType, int door){ //������3
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2(); //������1
		Car2 c2 = new Car2("blue"); //������2
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}
