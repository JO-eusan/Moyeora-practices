package Ch5_prac;

public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "): " + ch);
		}
		
		// String�� char[]�� ��ȯ
		char[] chArr = src.toCharArray();
		
		// char[]�迭�� ���
		System.out.println(chArr);

	}
}
