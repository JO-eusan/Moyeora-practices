package Ch7_prac;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date(); // �ٸ� ��Ű���� �ִ� Ŭ����. ��Ű�� ������ �߱� ������ �ٷ� ��밡��
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));

	}

}
