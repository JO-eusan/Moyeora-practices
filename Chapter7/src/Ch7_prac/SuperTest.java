package Ch7_prac;

public class SuperTest {

	public static void main(String[] args) {
		Child1 c = new Child1(); // ChildŬ������ ���������� c
		c.method(); // �������� c�� ���� method()ȣ��
	}

}

class Parent {
	int x = 10;
}

class Child1 extends Parent {
	void method() {
		System.out.println("x=" + x); // �θ� Ŭ������ ����Ǿ� �ִ� x�� ��� ����
		System.out.println("this.x=" + this.x); // �ν��Ͻ� ������ ���� (�ν��Ͻ� ���� = ��ӹ��� x)
		System.out.println("super.x=" + super.x); // ��ӹ��� ����� ���� (x)
	}
}
