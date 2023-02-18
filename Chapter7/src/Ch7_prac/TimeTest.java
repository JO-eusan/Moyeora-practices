package Ch7_prac;

public class TimeTest {

	public static void main(String[] args) {
		Times t = new Times(12, 35, 30);
		System.out.println(t);
		// t.hout = 13; hour�� ���� �����ڰ� private�̹Ƿ� ������ �� ����.
		t.setHour(t.getHour() + 1); // ���� �ð����� 1�ð� �ķ� ����
		System.out.println(t);
	}

}

class Times { // �ð��� �����ϴ� Ŭ���� 
	private int hour, minute, second; // ��������� private�� �����ϴ� ���� �ٶ�����
	
	Times(int hour, int minute, int second) { //������
		setHour(hour); // setter�� �̿��� ���� ���� + ���Ǽ� �˻�
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