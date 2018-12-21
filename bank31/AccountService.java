package bank31;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface AccountService {
	// 서비스 로직에는 생성자 없어야되고 멤버변수를 두지 않는다.(지금은)
	public String accountNum() ;
		
		
	/**
	 오늘 날짜 구하기
	 * */
	public String today() ;
	
	/**
	 계좌정보보여주기
	 * */
	public String info(String name, String accountNum, String today, int money);
		
	
	/**
	 입금하기
	 * */
	public String  deposit(int money);
		
	
	/**
	 출금하기
	 * */
	public String withDraw(int money) ;
		
	
}
