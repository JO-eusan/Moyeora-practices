package Ch6_prac;

public class StaticBlockTest {
	static int[] arr = new int[10]; // 배열
	
	static { //클래스 초기화 블럭
		for(int i=0; i < arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

}
