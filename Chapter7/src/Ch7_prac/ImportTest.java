package Ch7_prac;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date(); // 다른 패키지에 있는 클래스. 패키지 선언을 했기 때문에 바로 사용가능
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));

	}

}
