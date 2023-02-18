package Ch7_prac;

final class Singleton { // �ڼ� Ŭ������ ���� �� ����.
	private static Singleton s = new Singleton();
	
	private Singleton() { // ������
		
	}
	
	public static Singleton getInstantce() {
		if(s==null) 
			s = new Singleton();
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); �����ڰ� private�̹Ƿ� error
		Singleton s = Singleton.getInstantce(); // static�̹Ƿ� �ν��Ͻ��� �������� �ʰ� �ٷ� ȣ�� ����!
	}

}
