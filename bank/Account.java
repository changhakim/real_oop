package bank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
public class Account {
	final static String BANK_NAME = "국민은행"; // 상수
	String accountNum; // 인스턴스 변수( 멤버변수)
	int money;
	String today;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
	}
	
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		int geza[] = new int[12]; 
		for(int i =0;i<geza.length;i++) {
			geza[i] = random.nextInt(10);

			if(i==2 || i==5) {
				accountNum += geza[i]+"-";
			}else {
				accountNum += geza[i];
			}
		}
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();//컴퓨터날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//사람이 볼수있게 변환
		today=sdf.format(date);
		return today;
	}
	public String accountNew(String name) {
		String account = "";



		account = String.format(" 은행이름:%s\n "
								+ "계좌:%s\n"
								+ "이름%s\n "
								+ "개설일:%s\n"
								+ " 잔액 %d\n", BANK_NAME,accountNum,name,today,money);

		return account;
	}
}
