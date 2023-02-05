package Ch6_prac;

public class BlockTest {
	static { //클래스 초기화 블럭(static)
		System.out.println("static { }"); // 1
	}
	
	{ //인스턴스 초기화 블럭
		System.out.println("{ }"); // 3 // 7
	}
	
	public BlockTest() { //생성자
		System.out.println("생성자"); // 4
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); "); // 2
		BlockTest bt = new BlockTest(); // 인스턴스 생성
		
		System.out.println("BlockTest bt2 = new BlockTest(); "); // 5
		BlockTest bt2 = new BlockTest(); // 6 // 8

	}

}
