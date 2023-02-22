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
		System.out.println("x=" + x); // this.x�� ����.
		System.out.println("super.x=" + super.x ); // ���� Ŭ������ �ν��Ͻ� ����
		System.out.println("this.x=" + this.x); // ���� Ŭ���� ���� �ν��Ͻ� ����
		
	}
}