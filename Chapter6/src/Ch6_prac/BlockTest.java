package Ch6_prac;

public class BlockTest {
	static { //Ŭ���� �ʱ�ȭ ��(static)
		System.out.println("static { }"); // 1
	}
	
	{ //�ν��Ͻ� �ʱ�ȭ ��
		System.out.println("{ }"); // 3 // 7
	}
	
	public BlockTest() { //������
		System.out.println("������"); // 4
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); "); // 2
		BlockTest bt = new BlockTest(); // �ν��Ͻ� ����
		
		System.out.println("BlockTest bt2 = new BlockTest(); "); // 5
		BlockTest bt2 = new BlockTest(); // 6 // 8

	}

}
