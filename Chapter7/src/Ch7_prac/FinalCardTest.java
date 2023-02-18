package Ch7_prac;

class Cards { // 카드 정의 클래스
	final int NUMBER; // 상수지만 선언과 함께 초기화 하지 않고
	final String KIND; // 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	Cards(String kind, int number) { // 매개변수로 넘겨받은 값으로 초기화
		KIND = kind;
		NUMBER = number;
	}
	
	Cards() {
		this("HEART", 1); // 기본값
	}
	
	public String toString() {
		return KIND + " " + NUMBER; // 출력 toString()메서드
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Cards c = new Cards("Heart", 10);
		// c.NUMBER = 5; 에러 발생, 상수는 변경 불가능
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // c.toString()과 같은 의미
	}

}
