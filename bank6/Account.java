package bank6;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	final static String BANK_NAME ="최고은행"; 
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum = this.accountNum();
		this.today = this.today();
		this.money = money;
		
	}
	public String accountNum() {
		String accountNum = "";
		int[]a = new int[12];
		Random random = new Random();
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			if(i == 2 || i ==5) {
			accountNum += a[i] + "-";
			}else{
			accountNum += a[i];	
			}
		}
		
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		today = sdf.format(date);
		return today;
	}
	public String info(String name) {
		
		
		
		return String.format("이름:%s\n"
							+"계좌번호:%s%s\n"
							+ "생성일자\n"
							+ "잔액",name,BANK_NAME,accountNum,today,money);
	}
}
