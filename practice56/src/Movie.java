//컴퓨터학과_20220740_가유빈
import java.util.Random;
public class Movie {
	Random rd = new Random();
	
	private String title, director, mid;
	private int score, year;
	// 설정자와 접근자 추가
	public void setTitle(String t) {title = t;}
	public void setDirector(String d) {director = d;}
	public void setScore(int s) {score = s;}
	public void setYear(int y) {year = y;}
	public void setMid(String m) {mid = m;}
	
	public String getTitle() {return title;}
	public String getDirector() {return director;}
	public int getScore() {return score;}
	public int getYear() {return year;}
	public String getMid() {return mid;}
	
	public String toString() {
		String rslt = "";
		
		rslt += "번호: " + mid;
		rslt += "\n제목: " + title;
		rslt += "\n감독: " + director;
		rslt += "\n제작년도: " + year + "년";
		
		return rslt;
	}
	
	public Movie() {
		this.mid = makeID();
		this.title = "모름";
		this.director = "모름";
		this.year = -1;
		this.score = -1;
	}
	private String makeID() {
		int a = rd.nextInt(9000) + 1000;
		int b = rd.nextInt(9000) + 1000;
		
		String s = "";
		s += a + " - " + b;
		
		return s;
	}
	
	public static String compareMovies (Movie x, Movie y) {
		boolean A = compareDirector(x,y);
		boolean B = compareYear(x,y);
		String rslt = "영화 " + x.mid + "와 영화 " + y.mid + "는 ";
		
		if(A == true && B == true)
			rslt += "감독이 같고 제작년도도 같습니다";
		else if(A == true && B == false)
			rslt += "감독이 같고 제작년도가 다릅니다.";
		else if(A == false && B == true)
			rslt += "감독이 다르고 제작년도가 같습니다.";
		else
			rslt += "감독이 다르고 제작년도도 다릅니다.";
		
		return rslt;
	}
	private static boolean compareDirector (Movie x, Movie y) {
		if(x.director.equals(y.director))
			return true;
		else
			return false;
	}
	private static boolean compareYear (Movie x, Movie y) {
		if(x.year == y.year)
			return true;
		else
			return false;
	}
}
