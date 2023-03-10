package Ch2_prac;

public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // 리터럴 접미사 필요
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10
		int hexNum = 0x10; // 16진수 10
		int binNum = 0b10; // 2진수 10;
		
		System.out.printf("b = %d%n", b); // 10진 출력
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d %n", c, (int)c); // 문자 출력
		System.out.printf("finger = [%5d]%n", finger); // 5칸 확보
		System.out.printf("finger = [%-5d]%n", finger);
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big = %d%n", big);
		System.out.printf("hex = %#x%n", hex); // #은 접두사
		System.out.printf("octNum = %o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum); // 2진수를 문자열로 반환
	}

}
