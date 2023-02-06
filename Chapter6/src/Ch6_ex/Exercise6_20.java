package Ch6_ex;

public class Exercise6_20 {
	
	public static int[] shuffle(int[] arr) { // 주어진 배열에 담긴 값의 위치를 바꾸는 작업이 반복하게 뒤섞이게 한다.
		if(arr==null || arr.length==0) {
			return arr;
		}
		
		for(int i=0; i < arr.length; i++) {
			int j = (int)(Math.random()*arr.length);
			// 값 교체
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original)); // 배열 출력
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
