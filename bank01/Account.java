package bank01;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	final static String NAME_BANK = "신한은행";
	String accountNum;
	int money;
	String today;
	
	Account( int money ){
		this.accountNum = this.accountNum();
		this.today = this.today();
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:aa");
		today=sdf.format(date);
		return today;
	}
	public String accountsee(String name) {
	String accountsee = "";
	
	
	
	return String.format("이름:%s\n"
						+ "은행:%s\n"
						+ "계좌번호:%s\n"
						+ "잔액:%d\n"
						+ "개설날짜%s",name,NAME_BANK,accountNum,money,today);
	}
	public String accountNum() {
		String accountNum = "";
		Random random = new Random();
		int[] a = new int[12]; 
		for(int i =0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			if(i==2||i==5) {
				accountNum += a[i]+"-";
			}else {
				accountNum += a[i]+"";

			}
		}


		return accountNum;
	}
}
