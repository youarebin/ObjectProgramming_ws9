//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 날짜를 입력하세요");
		System.out.print("년도:");
		int year = sc.nextInt();
		System.out.print("월:");
		int month = sc.nextInt();
		System.out.print("일:");
		int day = sc.nextInt();
		Date d1 = new Date(year, month, day);
		
		System.out.println("두 번째 날짜를 입력하세요 ");
		Date d2 = new Date();
		System.out.print("년도:");
		d2.setYear(sc.nextInt());
		System.out.print("월:");
		d2.setMonth(sc.nextInt());
		System.out.print("일:");
		d2.setDay(sc.nextInt());
		
		int rslt = Date.compareDate (d1,d2);
		if(rslt == -1)
			System.out.print("첫 번째 날짜인 " + d1.toString() + "이 앞선 날짜입니다.");
		else if(rslt == 1)
			System.out.print("두 번째 날짜인 " + d2.toString() + "이 앞선 날짜입니다.");
		else if(rslt == 0)
			System.out.print("두 날짜는 같은 날짜입니다.");
	}

}
