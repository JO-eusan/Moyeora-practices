package Ch7_prac;

public class BindingTest3 {

	public static void main(String[] args) {
		Parents p = new Children();
		Children c = new Children();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}
//class Parents {
//	int x = 100;
//	
//	void method() {
//		System.out.println("Parent Method");
//	}
//}

class Children extends Parents {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); // this.x와 같다.
		System.out.println("super.x=" + super.x ); // 조상 클래스의 인스턴스 변수
		System.out.println("this.x=" + this.x); // 같은 클래스 내의 인스턴스 변수
		
	}
}