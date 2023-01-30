package Ch6_prac;
public class MemberCall {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // Ŭ���� ����
	
	int iv2 = cv;
	// static int cv2 = iv; ����. Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv; // ��ü�� �����ؾ� ��밡��
	
	static void staticMethod1() { // Ŭ���� �޼���
		System.out.println(cv);
		// System.out.println(iv); ����. Ŭ�����޼��忡�� �ν��Ͻ������� ���Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // ��ü�� ������ �Ŀ� �ν��Ͻ������� ��������
	}
	
	void instanceMethod1() { // �ν��Ͻ� �޼���
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ��޼��忡�� �ν��Ͻ������� �ٷ� ��밡��
	}
	
	static void statiacMethod2() { // Ŭ���� �޼���
		staticMethod1();
		// instanceMethod1(); ����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� �ִ�.
	}
	
	void instanceMethod2() { // �ν��Ͻ� �޼���
		staticMethod1();
		instanceMethod1();
	}
}
