package Ch6_prac;

class Car1{
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	Car1() {} // 매개변수가 없는 생성자
	Car1(String c, String g, int d) { // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car1 c1 = new Car1(); //매개변수가 없는 생성자 부름
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car1 c2 = new Car1("white", "aute", 4); //매개변수가 있는 생성자 부름
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		

	}

}
