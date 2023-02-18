package Ch7_prac;

public class PointTest {

	public static void main(String[] args) {
		Point3D1 p3 = new Point3D1(1,2,3); // 생성자로 접근
	}

}

class Point1 {
	int x, y;
	
	Point1 (int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}
	
	String getLocation() { // 메서드
		return "x: " + x + ", y: " + y;
	}
}

class Point3D1 extends Point1 {
	int z;
	
	Point3D1 (int x, int y, int z) { // 생성자
		super(x, y); // super도 매개변수 개수에 따라 여러개 생성 가능 (Point 클래스의 생성자 Point(int x, int y)호출
		// 생성자 첫 줄에 다른 생성자를 생성하지 않으면  super(); 자동 삽입 (super() = Point 클래스의 생성자)
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() { // 오버라이딩
		return "x: " + x + ",y: " + y + ",z: " + z;
	}
}
