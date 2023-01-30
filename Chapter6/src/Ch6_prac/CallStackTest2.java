package Ch6_prac;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작"); // 1
		firstMethod();
		System.out.println("main(String[] args)이 끝"); // 6
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작"); // 2
		secondMethod();
		System.out.println("fistMethod()이 끝"); // 5
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작"); // 3
		System.out.println("secondMethod()이 끝"); // 4
	}
}
