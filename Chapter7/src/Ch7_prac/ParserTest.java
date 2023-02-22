package Ch7_prac;

interface Parseable {
	// ���� �м��۾��� �����Ѵ�.
	public abstract void parse(String fileName); // �߻�޼���
}

class ParserManager {
	// returnŸ���� Parseable�������̽��̴�. (�ν��Ͻ��� ������ Ŭ������ �ν��Ͻ��� ��ȯ)
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
		/*�����м��ϴ� �ڵ�*/
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		/*�����м��ϴ� �ڵ�*/
		System.out.println(fileName + "-HTML parsing completed.");
	}
}
public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML"); // type�� ���� �����ϴ� �ν��Ͻ��� ��ȭ
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");

	}

}
