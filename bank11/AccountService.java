package bank11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	// 서비스 로직에는 생성자 없어야되고 멤버변수를 두지 않는다.(지금은)
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
	
	public String info(String name, String accountNum, String today, int money) {
		return String.format("이름:%s\n"
				+ "계좌번호:%s%s\n"
				+ "생성날짜:%s\n"
				+ "잔액%d",name,AccountBean.BANK_NAME, // 상수는 클래스이름.상수명
				accountNum,today,money);
	}
	
	/**
	 * 입금하기
	 * */
	
	/*public String  deposit(int money) {
		String deposit = "";
		
		if(money>0) {
			this.money += money;
			deposit = "입금되었습니다.";
		}else {
			deposit = "오류";
		}
		
		 return deposit;
		
	}*/
	/**
	 * 출금하기
	 * */
	/*public String withDraw(int money) {
		String withDraw = "";
		
		if(this.money>= money && this.money>0) {
			this.money -= money;
			withDraw = "출금되었습니다.";
		}else {
			withDraw = "에러";
		}
		return  withDraw;
		
		
	}*/
}
