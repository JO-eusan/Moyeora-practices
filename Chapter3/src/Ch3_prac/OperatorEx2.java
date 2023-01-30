package Ch3_prac;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i= " + i + ", j= " + j);
		
		// 결과 비교를 위해 i,j 값 초기화
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i= " + i + ", j= " + j);
		
	}

}
