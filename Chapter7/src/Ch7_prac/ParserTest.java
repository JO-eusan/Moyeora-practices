package Ch7_prac;

interface Parseable {
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName); // 추상메서드
}

class ParserManager {
	// return타입이 Parseable인터페이스이다. (인스턴스를 구현한 클래스의 인스턴스를 반환)
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		/*구문분석하는 코드*/
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		/*구문분석하는 코드*/
		System.out.println(fileName + "-HTML parsing completed.");
	}
}
public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML"); // type에 따라 생성하는 인스턴스가 변화
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");

	}

}
