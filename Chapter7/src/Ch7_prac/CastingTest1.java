package Ch7_prac;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;에서 자손클래스를 조상클래스로 형변환하기 때문에 생략 가능
//		car.water(); car은 자손 클래스에만 존재하는 메서드를 사용할 수 없다.
		fe2 = (FireEngine)car; // 조상타입에서 자손타입으로의 형변환이기 때문에 생략 불가능
		fe2.water();
	}

}

class Car {
	String color; // 색
	int door; // 문의 개수
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrrr~");
	}
	void stop() { // 멈추는 기능
		System.out.println("Stop!!!");
	}
}
class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("Water!!!");
	}
}
