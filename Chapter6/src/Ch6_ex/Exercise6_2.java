package Ch6_ex;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard{
	int num; //카드의 숫자 (1~10사이의 정수)
	boolean isKwang; //'광'판별 (true or false)
	
	SutdaCard(){
		this(1, true); //기본값 호출
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info(){ // 숫자를 문자열로 반환. 광인 경우 K를 덧붙임
		return num + (isKwang? "K" : "");
	}
}