package Ch6_prac;

//class Tv{
//	//Tv�� �Ӽ�(�������)
//	String colors; // ����
//	boolean power; // �������� (on/off)
//	int channel; // ä��
//	
//	//Tv�� ���(�޼���)
//	void power() {power = !power;} // Tv�� �Ѱų� ���� ����� �ϴ� �޼���
//	void channelUp() { ++channel;} // Tv�� ä���� ���̴� ����� �ϴ� �޼���
//	void channelDown() { --channel;} // Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
//}


public class TvTest2 {

	public static void main(String[] args) {
		Tv t1 = new Tv(); // �ѹ������� ǥ�� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
		t1.channel = 7; // channel ���� 7�� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}
