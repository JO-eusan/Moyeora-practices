package Ch7_prac;

public class InterfaceTest3 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();

	}

}
class A3 {
	void methodA() {
		I3 i = InstanceManager.getInstance(); // �� 3�� Ŭ������ �޼��带 ���ؼ� �������̽� I�� ������ Ŭ������ �ν��Ͻ��� ���´�
		i.methodB();
		System.out.println(i.toString()); // i�� ObjectŬ������ �޼��� ȣ�� ����
	}
}

interface I3 {
	public abstract void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {return "class B";}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}