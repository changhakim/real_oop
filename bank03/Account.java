package bank03;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	final static String NAME_BANK ="신한은행";
	String accountNum,test;
	int money;
	Account(int money){
		this.money = money;
		this.accountNum = this.accountNum();
	}
	public String accountNum() {
		String accountNum = "";
		Random random = new Random();
		int[] a = new int[12]; 
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			if(i==2||i==5) {
			accountNum += a[i]+"-";	
				}else {
			accountNum += a[i];
			}
		}
		return accountNum;
	}
	public String info() {
		String info = "";
		return info;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		today = sdf.format(date);
		
		return today;
	}
	
	
}
