package Ch7_prac;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank(); // Repairable
		Dropship dropship = new Dropship(); // Repairable
		
		Marine marine = new Marine(); // RepairableX
		SCV scv = new SCV(); // 건설인부 - 수리의 주체
		
		scv.repair(tank); // SCV가 tank를 수리하도록 한다.
		scv.repair(dropship);
		//scv.repair(marine); // repairable은 marine에는 적용이 안된다.
	}

}

interface Repairable {} // 수리하는 기능

class Units { // 유닛 기본 틀 정의
	int hitPoint;
	final int MAX_HP;
	Units(int hp) { // 생성자
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Units { // 땅 속성 유닛
	GroundUnit(int hp) {
		super(hp); // 조상클래스의 생성자 호출
	}
}

class AirUnit extends Units { // 하늘 속성 유닛
	AirUnit(int hp) {
		super(hp); // 조상 클래스의 생성자 호출
	}
}

class Tank extends GroundUnit implements Repairable { // 탱크는 땅 속성이고 수리 기능이 있다.
	Tank() { // 생성자
		super(150); // Tank의 HP는 150
		hitPoint = MAX_HP;
	}
	
	public String toStirng() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable { // Dropship은 하늘 속성이고 수리 기능이 있다.
	Dropship() { // 생성자
		super(125); // Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	public String toStirng() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit { // Marine은 땅 속성이로 수리 기능은 없다.
	Marine() { // 생성자
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable { // SCV는 땅 속성이고 수리기능이 있다.(수리 주체-repair 메서드)
	SCV() { // 생성자
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) { // Repairable인터페이스를 구현한 클래스들은 모두 매개변수로 들어갈 수 있다.
		if(r instanceof Units) {
			Units u = (Units)r;
			while(u.hitPoint != u.MAX_HP) {
				// Unit의 HP를 증가시킨다.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	//...
}
