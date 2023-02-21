//컴퓨터학과_20220740_가유빈
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BankAccount b0 = new BankAccount("김동덕",100,3.1);
		BankAccount b1 = new BankAccount("홍길동",2000,2.15);
		BankAccount b2 = new BankAccount("성춘향",500,2.05);
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n계좌 " + b0.getAccoutNo() +"에 입금할 금액을 입력하세요: ");
		int in = sc.nextInt();
		
		if(b0.deposit(in))
			System.out.println("계좌 " + b0.getAccoutNo() + ": 입금이 성공했습니다.\n");
		else
			System.out.println("입금이 실패했습니다.\n");
		
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n계좌 " + b1.getAccoutNo() +"에서 출금할 금액을 입력하세요: ");
		int out = sc.nextInt();
		
		if(b1.withdraw(out))
			System.out.println("출금이 성공했습니다.\n");
		else
			System.out.println("출금이 실패했습니다.\n");
		
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n계좌 " + b1.getAccoutNo() +"에서 계좌 " + b2.getAccoutNo() + "으로 송금할 금액을 입력하세요: ");
		int send = sc.nextInt();
		
		if(BankAccount.transfer(b1,b2,send))
			System.out.println("송금이 성공했습니다.\n");
		else
			System.out.println("송금이 실패했습니다.\n");
		
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
	}

}
