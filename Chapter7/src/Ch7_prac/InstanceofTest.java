package Ch7_prac;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngines fe = new FireEngines();
		
		if(fe instanceof FireEngines) {
			System.out.println("This is a FireEngines instance.");
		}
		if(fe instanceof Cars) {
			System.out.println("This is a Cars instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName()); // 클래스 이름을 출력

	}

}
class Cars{}
class FireEngines extends Cars{}
