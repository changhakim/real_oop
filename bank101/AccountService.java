package bank101;



public interface AccountService {
	// 서비스 로직에는 생성자 없어야되고 멤버변수를 두지 않는다.(지금은)
	public AccountBean accountNum() ;
		
		
	/**
	 오늘 날짜 구하기
	 * */
	public AccountBean today() ;
	
	/**
	 계좌정보보여주기
	 * */
	public String info(String name, String accountNum, String today);
		
	
	/**
	 입금하기
	 * */
	public String  deposit(int money);
		
	
	/**
	 출금하기
	 * */
	public String withDraw(int money) ;
		
	
}
