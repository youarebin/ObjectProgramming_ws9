//컴퓨터학과_20220740_가유빈
import java.util.Random;
public class BankAccount {

	Random rd = new Random();
	
	private String name, accoutNo;
	private int balance;//잔액
	private double interest;
	// 설정자와 접근자 추가
	public void setName(String n) {name = n;}
	public void setAccoutNo(String a) {accoutNo = a;}
	public void setBalance(int b) {balance = b;}
	public void setRate(double r) {interest = r;}
	
	public String getName() {return name;}
	public String getAccoutNo() {return accoutNo;}
	public int getBalance() {return balance;}
	public double getRate() {return interest;}
	//생성자
	public BankAccount() {this("모름", 0, 0);}
	public BankAccount(String name, int balance) {this("", 0, 0);}
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
		this.accoutNo = makeID();
	}
	//소속 메소드
	int a,b;
	private String makeID() {
		a = rd.nextInt(9000) + 1000;
		b = rd.nextInt(9000) + 1000;
		
		String s = "";
		s += a + " - " + b;
		
		return s;
	}
	public String toString() {
		String rslt = "";
		
		rslt += accoutNo + " :: ";
		rslt += name + " :: ";
		rslt += balance + " :: ";
		rslt += interest + "%";
		
		return rslt;
	}
	private int calcInterest() {
		return (int)(interest*balance/100);
	} // 잔액과 이자율을 이용하여 이자 계산

	public boolean deposit(int money) {//입금
		if(money > 0)
		{
			this.balance += money;
			return true;
		}
		else
			return false;
	}
	public boolean withdraw(int money) {//출금
		if(this.balance < money || money < 0)
			return false;
		else
		{
			balance -= money;
			return true;
		}
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if(money > from.balance)
			return false;
		else
		{
			from.balance -= money;
			to.balance += money;
			
			return true;
		}
		
	}
}
