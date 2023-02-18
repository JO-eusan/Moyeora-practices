package Ch7_prac;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c); // System.out.println(c.toString());과 같다.
		
		d.shuffle(); // 카드를 섞는다.
		c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52; // 카드의 개수 (상수)
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함 - 카드의 개수 만큼 크기 확보
	
	Deck() { // Deck의 카드를 초기화 (생성자)
		int i=0;
		for(int k=Card.KIND_MAX; k > 0; k--) {
			for(int n=0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	
	Card pick(int index) { // 지정된 위치에 있는 카드 하나를 꺼내서 반환(메서드) - 매개변수 존재
		return cardArr[index];
	}
	
	Card pick() { // Deck에서 카드 하나를 선택한다(메서드) - 매개변수 존재X
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void shuffle() { // 카드의 순서를 섞는다.(메서드)
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수(상수)
	static final int NUM_MAX = 13; // 무늬별 카드 수(상수)
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card() { // 생성자
		this(SPADE, 1);
	}
	
	Card(int kind, int number) { // 생성자 (매개변수 O)
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() { // 참조변수의 출력이나 덧셈연산자를 이용한 참조변수와 문자열의 결합에 자동적으로 호출
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String number = "0123456789XJQK"; // 숫자 10은 X로 표현
		return "kind: " + kinds[this.kind] + ", number: " + number.charAt(this.number);
	}
}