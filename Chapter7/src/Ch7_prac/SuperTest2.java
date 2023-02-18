package Ch7_prac;

public class SuperTest2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}

//class Parent {
//	int x = 10;
//}

class Child2 extends Parent {
	int x = 20;
	void method() {
		System.out.println("x=" + x); // 마지막 선언 x = 20
		System.out.println("this.x=" + this.x); // 자손클래스에 선언된 변수 x = 20
		System.out.println("super.x=" + super.x); // 상속받은 멤버로 접근 (x = 10)
	}
}