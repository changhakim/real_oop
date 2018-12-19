package bank5;

public class Member {
	String name,id,pass,ssn;// 멤버변수=인스턴스변수 (선언 "="가없다)
	
	Member(String name,String id, String pass,String ssn){
		this.name = name; 	// 초기화
		this.id = id;		//초기화
		this.pass = pass;	//초기화
		this.ssn = ssn;		//초기화
	}
	
	/**
	 회원정보 보여주기
	 * */
	public String info() {
		String info = "";
		return String.format("이름:%s\n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호:%s",name,id,pass,ssn);
	}
}
