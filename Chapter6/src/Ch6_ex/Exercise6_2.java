package Ch6_ex;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard{
	int num; //ī���� ���� (1~10������ ����)
	boolean isKwang; //'��'�Ǻ� (true or false)
	
	SutdaCard(){
		this(1, true); //�⺻�� ȣ��
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info(){ // ���ڸ� ���ڿ��� ��ȯ. ���� ��� K�� ������
		return num + (isKwang? "K" : "");
	}
}