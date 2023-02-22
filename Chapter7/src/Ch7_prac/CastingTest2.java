package Ch7_prac;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); // 조상 객체 생성 - Car car = new FireEngine();로 변경하면 실행시 오류 발생X
		Car car2 = null; // 조상 객체 생성2
		FireEngine fe = null; // 자손 객체 생성

		car.drive();
		fe = (FireEngine)car; // 조상 타입에서 자손타입으로 형변환 (컴파일은 OK, 실행 시 에러 발생 - 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용X)
		fe.drive();
		car2 = fe; // 자손타입에서 조상타입으로 형변환
		car2.drive();
	}

}
