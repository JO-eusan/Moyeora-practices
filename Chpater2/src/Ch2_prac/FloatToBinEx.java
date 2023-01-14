package Ch2_prac;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); // float에서 int로 변환
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);

	}

}
