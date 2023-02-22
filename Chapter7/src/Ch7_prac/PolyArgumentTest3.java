package Ch7_prac;
import java.util.*;
//class Prod {
//	int price;
//	int bonusPoint;
//	
//	Prod(int price) {
//		this.price = price;
//		bonusPoint = (int)(price/10.0);
//	}
//	Prod() {} // �⺻ ������
//}

//class Tele extends Prod {
//	Tele() { super(100); } // ���� Ŭ���� ������ ȣ��
//	public String toString() { return "TeleVision"; }
//}
//
//class Computers extends Prod {
//	Computers() { super(200); }
//	public String toString() { return "Computers"; }
//}
//
//class Audio extends Prod {
//	Audio() {super(50); }
//	public String toString() { return "Audio"; }
//}

class Buy {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // ������ ��ǰ�� �����ϱ� ���� �迭
	
	void buy(Prod p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // ������ ��ǰ�� Vector�� ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Prod p) { // ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) { // ������ ��ǰ�� Vector���� �����Ѵ�.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else { // ���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() { // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum=0; // ������ ��ǰ�� ���� �հ�
		String itemList = ""; // ������ ��ǰ ���
		if(item.isEmpty()) { // Vector�� ����ִ��� Ȯ���Ѵ�.
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		// �ݺ����� ����Ͽ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i < item.size(); i++) {
			Prod p = (Prod)item.get(i); // Vector�� i��°�� �ִ� ��ü�� ���´�.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buy b = new Buy();
		Tele tv = new Tele();
		Computers com = new Computers();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

	}

}
