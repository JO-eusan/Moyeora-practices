package Ch6_prac;

// class Data {int x;}

public class ReferenceReturnEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10; // 인스턴스 d의 x값을 10으로 초기화
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);

	}
	
	static Data copy(Data d) { // return타입이 Data(참조형)
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}

}
