package bank2;
import java.util.Date;
import java.util.Random;



import java.text.SimpleDateFormat;
public class Account {
	final static String  NAME_BANK = "신한은행";
	String accountCreat;
	int money;
	String times;
	Account(int money) {
		this.money = money;
		this.accountCreat = accountCreat();
		this.times = times();
	}
	public String accountNew(String name) {
		String accountNew = "";



		return String.format("이름:%s\n"
				+ "%s%s\n"
				+ "생성날짜:%s\n"
				+ "잔액:%d\n",name,NAME_BANK,accountCreat,times,money);
	}
	public String times() {
		String times = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		times = sdf.format(date);
		return times;
	}
	
	public String accountCreat() {
		String	accountCreat = "";
		Random random = new Random();
		int a[] = new int[12];
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			if(i==2 || i == 5) {

				accountCreat += a[i]+"-";
			}else {
				accountCreat += a[i];
			}
		}



		return accountCreat;
	}
}
