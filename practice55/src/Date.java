//컴퓨터학과_20220740_가유빈
public class Date {

	private int year;
	private int month;
	private int day;
	
	// 설정자 메소드 수정
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDay(int day) {this.day = day;}
	// 접근자 메소드
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	
	public String toString() {
		return getYear() +  "년 " + getMonth() + "월 " + getDay() + "일";
	}
	//생성자 중복정의
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public Date() {this(1900, 1, 1);}
	
	public static int compareDate(Date x, Date y) {
		if(x.year < y.year)
			return -1;
		else if(x.year > y.year)
			return 1;
		else
		{
			if(x.month < y.month)
				return -1;
			else if(x.month > y.month)
				return 1;
			else
			{
				if(x.day < y.day)
					return -1;
				else if(x.day > y.day)
					return 1;
				else
					return 0;
			}
		}
	}
}