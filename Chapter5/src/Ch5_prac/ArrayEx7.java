package Ch5_prac;

public class ArrayEx7 {

	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println(); // 줄바꿈
		 for (int i=0; i < 100; i++) {
			 int n = (int)(Math.random()*10); // 0~9 중 임의의 한값을 얻는다.
			 int tmp = numArr[0];
			 numArr[0] = numArr[n];
			 numArr[n] = tmp; // 0번째와 n번째의 값을 서로 바꾼다.
		 }
		 
		 for (int i=0; i < numArr.length; i++) {
			 System.out.print(numArr[i]);
		 }
		

	}
}
