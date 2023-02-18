package Ch7_prac;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x = " + p3.x); // 100
		System.out.println("p3.y = " + p3.y); // 200
		System.out.println("p3.z = " + p3.z); // 300
	}

}

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2 (int x, int y) { // 생성자
		
		// super(); 자동 추가 - object클래스로 이동
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z = 30;
	
	Point3D2() { // 생성자
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출
	}
	
	Point3D2(int x, int y, int z) {
		super(x, y); // 조상 클래스 멤버변수 초기화 - Point(int x, int y)를 호출
		this.z = z;
	}
}
