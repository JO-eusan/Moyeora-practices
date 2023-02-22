package Ch7_prac;

class InnerEx1 { // �ܺ�Ŭ����
	class InstanceInner { // ����Ŭ����(�ν��Ͻ� Ŭ����)
		int iv = 100;
		// static int cv = 100; static������ ������ �� ����.
		final static int CONST = 100; // final static�� ����̹Ƿ� ���
	}
	
	static class StaticInner { // ����Ŭ����(����ƽŬ����)
		int iv = 200;
		static int cv = 200; // staticŬ������ static����� ������ �� �ִ�.
	}
	
	void myMethod() {
		class LocalInner { // ����Ŭ����(����Ŭ����)
			int iv = 300;
			// static int cv = 300; static������ ������ �� ����.
			final static int CONST = 300; // final static�� ����̹Ƿ� ���
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}
}
