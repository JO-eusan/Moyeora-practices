package Ch7_prac;

class Prod {
	int price;
	int bonusPoint;
	
	Prod(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Prod() {} // �⺻ ������
}

class Tele extends Prod {
	Tele() { super(100); } // ���� Ŭ���� ������ ȣ��
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
	Prod[] item = new Prod[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // �迭 item�� ���� ī����
	
	void buy(Prod p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ�� �迭�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() { // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum=0; // ������ ��ǰ�� ���� �հ�
		String itemList = ""; // ������ ��ǰ ���
		
		// �ݺ����� ����Ͽ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i < item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
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
