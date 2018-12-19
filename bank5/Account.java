package bank5;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

/**
 상수
 BANK_NAME
 멤버변수
 1.accountNum계좌번호
 2.money 잔액
 3.today 해당일
기능
accountNum() 계좌번호생성(랜덤)
today() 해당일 생성
deposit(int money) 입금
withDraw(int money) 출금
 info(String name) 회원정보
 * */


public class Account {
	final static String BANK_NAME ="신한은행";
	String accountNum,today;
	int money;
	Account(int money ){
		this.accountNum = this.accountNum();
		this.money = money;
		this.today = this.today();
		
	}
	public String accountNum() {
		String accountNum = "";
		Random random = new Random();
		int[] account = new int[12];
		for(int i=0;i<account.length;i++) {
			account[i] = random.nextInt(10);
			if(i == 2 || i == 5) {
				accountNum += account[i]+"-"; 
			}else {
				accountNum += account[i];
			}
		}
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:aa");
		today = sdf.format(date);
		return today;
	}
	/**
	 * 입금하기
	 * */
	
	public void  deposit(int money) {
		
		
		if(money>0) {
			this.money += money;
		}
		
		 
		
	}
	/**
	 * 출금하기
	 * */
	public void withDraw(int money) {
		
		
		if(this.money-money>0 && this.money>0) {
			this.money -= money;
		}
		
		
	}
	public String massage(int money) {
		String message ="";
		
		
		if(money<0) {
			message = "마이너스는 사용할수 없습니다.";
		}else {
			message = "입금되었습니다";
		}
		
		return String.format("%s잔액:%d",message,this.money);
	}
	public String massage1(int money) {
		String message ="";
		
		if(this.money<0) {
			message = "잔액부족";
		
		}else if(money<0) {
			message = "마이너스는 사용할수 없습니다.";
		}else {
			message = "출금되었습니다.";
		}
		
		return String.format("%s잔액:%d", message,this.money);
	}
	public String info(String name) {
		String info = "";
		
		return String.format("이름:%s\n"
							+ "계좌번호:%s%s\n"
							+ "생성날짜:%s\n"
							+ "잔액%d",name,BANK_NAME,accountNum,today,money);
	}


}
/**
 
 * */
