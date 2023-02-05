package Ch6_prac;

class Data1{
	int value;
} // 생성자 정의가 안되어 있으므로 기본 생성자 추가

class Data2{
	int value;
	
	Data2(int x){ // 매개변수가 있는 생성자)(기본 생성자 추가 X)
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 new Data2(); 에러 발생 (기본 생성자 추가 X)
		Data2 d2 = new Data2(10); 
	}

}
