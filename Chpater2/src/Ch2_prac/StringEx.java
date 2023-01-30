package Ch2_prac;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name); // Java
		System.out.println(str); // Java8.0
		System.out.println(7 + " "); // 7 (문자열)
		System.out.println(" " + 7); //  7 (문자열)
		System.out.println(7 + ""); // 7
		System.out.println("" + 7); // 7
		System.out.println("" + ""); //
		System.out.println(7 + 7 + ""); // 14
		System.out.println("" + 7 + 7); // 77 (문자열)
		
	}

}
