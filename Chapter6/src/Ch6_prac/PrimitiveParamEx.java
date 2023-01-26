package Ch6_prac;

class Data {int x;}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; // 인스턴스 d의 변수 x의 값을 10으로 초기화
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // 메서드 호출
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		}
	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}


