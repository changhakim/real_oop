package bank21;
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
	public final static String BANK_NAME ="신한은행";
	private String accountNum,today;
	private int money;
	Account(int money ){
		this.accountNum = this.accountNum();
		this.money = money;
		this.today = this.today();
		
	}
	public void	setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public String getToday() {
		return this.today;
	}
	public String getAccountNum() {
		return this.accountNum;
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
	
	public String  deposit(int money) {
		String deposit = "";
		
		if(money>0) {
			this.money += money;
			deposit = "입금되었습니다.";
		}else {
			deposit = "오류";
		}
		
		 return deposit;
		
	}
	/**
	 * 출금하기
	 * */
	public String withDraw(int money) {
		String withDraw = "";
		
		if(this.money>= money && this.money>0) {
			this.money -= money;
			withDraw = "출금되었습니다.";
		}else {
			withDraw = "에러";
		}
		return  withDraw;
		
		
	}

	
	public String toString() {
		
		
		return String.format("이름:\n"
							+ "계좌번호:%s%s\n"
							+ "생성날짜:%s\n"
							+ "잔액%d",BANK_NAME,accountNum,today,money);
	}


}
/**
 
 * */
