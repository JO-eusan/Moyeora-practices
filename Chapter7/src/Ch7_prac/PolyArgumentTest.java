package Ch7_prac;

class Product { // ��ǰ�� �ʿ��� ����
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ� ����
	
	Product(int price) { // ������
		this.price = price;
		this.bonusPoint = (int) (price/10.0); // ���ʽ� ������ ��ǰ ������ 10%
	}
}

class Television extends Product { // ��ǰ�� �ϳ��� TV
	Television() { // ������
		// ����Ŭ������ ������ Product(int price)�� ȣ��
		super(100); // super�� ����Ŭ������ ������ ȣ���ϴ� ��.
	}
	// ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toStrnig() { return "Television"; }
}

class Computer extends Product { // ��ǰ�� �ϳ��� Computer
	Computer() { // ������
		super(200);
	}
	
	public String toString() { return "Computer"; }
}

class Buyer { // ��, ������ ��� ���
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price; // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʼ� ������ �߰��Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}
public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Television());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");

	}

}
