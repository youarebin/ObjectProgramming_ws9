//컴퓨터학과_20220740_가유빈
import java.util.Scanner;
public class Practice56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Movie m1 = new Movie();
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은?");
		m1.setTitle(sc.next());
		System.out.print("감독은? ");
		m1.setDirector(sc.next());
		System.out.print("제작 년도는?");
		m1.setYear(sc.nextInt());
		
		Movie m2 = new Movie();
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은?");
		m2.setTitle(sc.next());
		System.out.print("감독은? ");
		m2.setDirector(sc.next());
		System.out.print("제작 년도는?");
		m2.setYear(sc.nextInt());
		
		Movie m3 = new Movie();
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은?");
		m3.setTitle(sc.next());
		System.out.print("감독은? ");
		m3.setDirector(sc.next());
		System.out.print("제작 년도는?");
		m3.setYear(sc.nextInt());
		
		System.out.println("\n입력한 영화의 정보입니다.\n");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
		System.out.println(Movie.compareMovies(m1, m2));
		System.out.println(Movie.compareMovies(m1, m3));
		System.out.println(Movie.compareMovies(m2, m3));
	}

}
