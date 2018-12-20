package bank04;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	final static String NUM_BANK ="신한은행";
	int money;
	String accountcreate;
	String today;
	Account(int money){
		this.money = money;
		this.accountcreate = accountcreate();
		this.today = today();
	}
	public String accountsee(String name) {
		String accountsee = "";
		
		return String.format("이름:%s\n"
							+ "계좌:%s%s\n"
							+ "개설날짜%s:\n"
							+ "잔액%d",name,NUM_BANK,accountcreate,today,money);
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		today = sdf.format(date);
		return today;
	}
	public String accountcreate() {
	String	accountcreate = "";
	Random random = new Random();
	int[] a = new int[12]; 
	for(int i=0;i<a.length;i++) {
		a[i] = random.nextInt(10);
		if(i==2||i==5) {
			accountcreate += a[i]+"-";
		}else {
			accountcreate += a[i];
		}
	}
	return accountcreate;
	}
}
