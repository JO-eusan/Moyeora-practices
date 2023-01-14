package Ch2_prac;

public class CastingEx1 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score = " + score);
		System.out.println("d = " + d); // 형변환 이후에도 아무 변화 없다.

	}

}
