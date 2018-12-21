package bank31;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class AccountServiceImpl implements AccountService {

	@Override
	public String accountNum() {
		
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
		
		return accountNum;
	}

	@Override
	public String today() {
		String today = "";
		
		return null;
	}

	@Override
	public String info(String name, String accountNum, String today, int money) {
		// TODO Auto-generated method stub
		return null;
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

}
