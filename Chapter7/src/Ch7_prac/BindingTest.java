package Ch7_prac;

public class BindingTest {

	public static void main(String[] args) {
		Parents p = new Child(); // �θ� �������� - �ڼ� �ν��Ͻ�
		Child c = new Child(); // �ڼ� �������� - �ڼ� �ν��Ͻ�
		
		System.out.println("p.x = " + p.x); // �θ�Ŭ���� ����
		p.method();
		
		System.out.println("c.x = " + c.x); // �ڼ�Ŭ���� ����
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
