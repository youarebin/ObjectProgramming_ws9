//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n제주행 비행기의 정보를 입력하세요.");
		System.out.print("식별변호: ");
		int id1 = sc.nextInt();
		System.out.print("모델: ");
		String model1 = sc.next();
		System.out.print("승객수: ");
		int capacity1 = sc.nextInt();
		System.out.println("제주행 비행기의 정보입니다.");
		Plane m = new Plane();
		m.setId(id1);
		m.setModel(model1);
		m.setCapacity(capacity1);
		System.out.print(m.toString());
		
		System.out.println("\n서울행 비행기의 정보를 입력하세요.");
		System.out.print("식별변호: ");
		int id2 = sc.nextInt();
		System.out.print("모델: ");
		String model2 = sc.next();
		System.out.print("승객수: ");
		int capacity2 = sc.nextInt();
		System.out.println("서울행 비행기의 정보입니다.");
		Plane c = new Plane(id2,model2, capacity2);
		System.out.print(c.toString());
	}

}
