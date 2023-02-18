package Ch7_prac;

public class TimeTest {

	public static void main(String[] args) {
		Times t = new Times(12, 35, 30);
		System.out.println(t);
		// t.hout = 13; hour의 접근 제어자가 private이므로 접근할 수 없다.
		t.setHour(t.getHour() + 1); // 현재 시간보다 1시간 후로 변경
		System.out.println(t);
	}

}

class Times { // 시간을 정의하는 클래스 
	private int hour, minute, second; // 멤버변수를 private로 정의하는 것이 바람직함
	
	Times(int hour, int minute, int second) { //생성자
		setHour(hour); // setter를 이용해 값을 저장 + 유의성 검사
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) 
			return;
		this.minute = minute;
	}
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second < 0 || second > 59)
			return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second; 
	}
}