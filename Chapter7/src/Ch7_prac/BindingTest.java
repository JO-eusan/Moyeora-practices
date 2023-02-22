package Ch7_prac;

public class BindingTest {

	public static void main(String[] args) {
		Parents p = new Child(); // 부모 참조변수 - 자손 인스턴스
		Child c = new Child(); // 자손 참조변수 - 자손 인스턴스
		
		System.out.println("p.x = " + p.x); // 부모클래스 변수
		p.method();
		
		System.out.println("c.x = " + c.x); // 자손클래스 변수
		c.method();
	}

}

class Parents {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parents{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
