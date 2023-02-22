package Ch7_prac;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank(); // Repairable
		Dropship dropship = new Dropship(); // Repairable
		
		Marine marine = new Marine(); // RepairableX
		SCV scv = new SCV(); // �Ǽ��κ� - ������ ��ü
		
		scv.repair(tank); // SCV�� tank�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
		//scv.repair(marine); // repairable�� marine���� ������ �ȵȴ�.
	}

}

interface Repairable {} // �����ϴ� ���

class Units { // ���� �⺻ Ʋ ����
	int hitPoint;
	final int MAX_HP;
	Units(int hp) { // ������
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Units { // �� �Ӽ� ����
	GroundUnit(int hp) {
		super(hp); // ����Ŭ������ ������ ȣ��
	}
}

class AirUnit extends Units { // �ϴ� �Ӽ� ����
	AirUnit(int hp) {
		super(hp); // ���� Ŭ������ ������ ȣ��
	}
}

class Tank extends GroundUnit implements Repairable { // ��ũ�� �� �Ӽ��̰� ���� ����� �ִ�.
	Tank() { // ������
		super(150); // Tank�� HP�� 150
		hitPoint = MAX_HP;
	}
	
	public String toStirng() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable { // Dropship�� �ϴ� �Ӽ��̰� ���� ����� �ִ�.
	Dropship() { // ������
		super(125); // Dropship�� HP�� 125�̴�.
		hitPoint = MAX_HP;
	}
	public String toStirng() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit { // Marine�� �� �Ӽ��̷� ���� ����� ����.
	Marine() { // ������
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable { // SCV�� �� �Ӽ��̰� ��������� �ִ�.(���� ��ü-repair �޼���)
	SCV() { // ������
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) { // Repairable�������̽��� ������ Ŭ�������� ��� �Ű������� �� �� �ִ�.
		if(r instanceof Units) {
			Units u = (Units)r;
			while(u.hitPoint != u.MAX_HP) {
				// Unit�� HP�� ������Ų��.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
	//...
}
