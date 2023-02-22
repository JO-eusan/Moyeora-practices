package Ch7_prac;

class Prod {
	int price;
	int bonusPoint;
	
	Prod(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Prod() {} // 기본 생성자
}

class Tele extends Prod {
	Tele() { super(100); } // 조상 클래스 생성자 호출
	public String toString() { return "TeleVision"; }
}

class Computers extends Prod {
	Computers() { super(200); }
	public String toString() { return "Computers"; }
}

class Audio extends Prod {
	Audio() {super(50); }
	public String toString() { return "Audio"; }
}

class Buyers {
	int money = 1000;
	int bonusPoint = 0;
	Prod[] item = new Prod[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // 배열 item에 사용될 카운터
	
	void buy(Prod p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품을 배열에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() { // 구입한 물품에 대한 정보를 요약해서 보여준다.
		int sum=0; // 구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품 목록
		
		// 반복문을 사용하여 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i < item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyers b = new Buyers();
		
		b.buy(new Tele());
		b.buy(new Computers());
		b.buy(new Audio());
		b.summary();

	}

}
