package Ch7_prac;

public class SuperTest {

	public static void main(String[] args) {
		Child1 c = new Child1(); // Child클래스의 참조변수인 c
		c.method(); // 참조변수 c를 통해 method()호출
	}

}

class Parent {
	int x = 10;
}

class Child1 extends Parent {
	void method() {
		System.out.println("x=" + x); // 부모 클래스에 선언되어 있는 x를 상속 받음
		System.out.println("this.x=" + this.x); // 인스턴스 변수로 접근 (인스턴스 변수 = 상속받은 x)
		System.out.println("super.x=" + super.x); // 상속받은 멤버로 접근 (x)
	}
}
