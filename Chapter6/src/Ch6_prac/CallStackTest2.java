package Ch6_prac;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ����"); // 1
		firstMethod();
		System.out.println("main(String[] args)�� ��"); // 6
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ����"); // 2
		secondMethod();
		System.out.println("fistMethod()�� ��"); // 5
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ����"); // 3
		System.out.println("secondMethod()�� ��"); // 4
	}
}
