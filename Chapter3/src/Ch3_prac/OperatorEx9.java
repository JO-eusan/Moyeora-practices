package Ch3_prac;

public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b); // 계산할 때, long타입으로 변경
	}

}
