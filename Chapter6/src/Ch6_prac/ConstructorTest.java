package Ch6_prac;

class Data1{
	int value;
} // ������ ���ǰ� �ȵǾ� �����Ƿ� �⺻ ������ �߰�

class Data2{
	int value;
	
	Data2(int x){ // �Ű������� �ִ� ������)(�⺻ ������ �߰� X)
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 new Data2(); ���� �߻� (�⺻ ������ �߰� X)
		Data2 d2 = new Data2(10); 
	}

}
