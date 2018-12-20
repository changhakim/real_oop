package bank11;
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


public class AccountBean {
	public final static String BANK_NAME ="신한은행";
	private String accountNum,today;
	private int money;


	public void	setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setToday(String today) {

		this.today = today;
	}
	public String getToday() {
		return this.today;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}



	public String toString() {


		return String.format("계좌번호:%s\n"
				+ "생성날짜:%s\n"
				+ "잔액%d",accountNum,today,money);
	}


}
/**

 * */
