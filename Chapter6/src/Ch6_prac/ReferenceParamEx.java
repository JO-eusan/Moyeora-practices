package Ch6_prac;

// class Data {int x;}

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; // �� �ʱ�ȭ
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+ d.x);

	}
	
	static void change(Data d) { // ������ �Ű�����
		d.x = 1000; // �ּҰ� ��ü�� ����
		System.out.println("change() : x = " + d.x);
	}
}
