package Ch7_prac;

final class Singleton { // 자손 클래스를 가질 수 없다.
	private static Singleton s = new Singleton();
	
	private Singleton() { // 생성자
		
	}
	
	public static Singleton getInstantce() {
		if(s==null) 
			s = new Singleton();
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); 생성자가 private이므로 error
		Singleton s = Singleton.getInstantce(); // static이므로 인스턴스를 생성하지 않고 바로 호출 가능!
	}

}
