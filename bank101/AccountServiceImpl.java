package bank101;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class AccountServiceImpl implements AccountService {
	AccountBean account = null;
	@Override
	public AccountBean accountNum() {
		 account = new AccountBean();
		String accountNum = "";
		Random random = new Random();
		int[] a = new int[12];
		for(int i = 0;i<a.length;i++) {
			a[i] = random.nextInt(12);
			if(i == 2 || i ==5) {
				accountNum += a[i]+"-";
			}else {
				accountNum += a[i];
			}
		}
		account.setAccountNum(accountNum);
		return account;
	}

	@Override
	public AccountBean today() {
		account = new AccountBean();
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:aa");
		today = sdf.format(date);
		account.setToday(today);
		return account;
	}

	

	@Override
	public String deposit(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withDraw(int money) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String info(String name, String accountNum, String today) {
		// TODO Auto-generated method stub
		return String.format("이름%s\n"
				+ "계좌번호%s\n"
				+ "생성날짜:%s"
				+ "잔액",name,accountNum,today );
	}
	

}
