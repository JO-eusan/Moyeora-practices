package Ch6_prac;

class Tv{
	//Tv�� �Ӽ�(�������)
	String colors; // ����
	boolean power; // �������� (on/off)
	int channel; // ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;} // Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel;} // Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel;} // Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}

public class TvTest {

	public static void main(String[] args) {
		Tv t; // tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv(); // tv�ν��Ͻ��� �����Ѵ�
		t.channel = 7; // tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown(); // tv�ν��Ͻ� �޼��� channelDown()�� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");

	}

}
