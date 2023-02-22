package Ch7_prac;

class Product { // 상품이 필요한 정보
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price) { // 생성자
		this.price = price;
		this.bonusPoint = (int) (price/10.0); // 보너스 점수는 제품 가격의 10%
	}
}

class Television extends Product { // 상품중 하나인 TV
	Television() { // 생성자
		// 조상클래스의 생성자 Product(int price)를 호출
		super(100); // super은 조상클래스의 생성자 호출하는 것.
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toStrnig() { return "Television"; }
}

class Computer extends Product { // 상품중 하나인 Computer
	Computer() { // 생성자
		super(200);
	}
	
	public String toString() { return "Computer"; }
}

class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너수 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}
public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Television());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

	}

}
