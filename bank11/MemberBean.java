package bank11;

public class MemberBean {
	private String name,id,pass,ssn;// 멤버변수=인스턴스변수 (선언 "="가없다)
	
	
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass(String pass) {
		return this.pass;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setName(String name) {		//setter 세터
		this.name = name;	//write
	}
	public String getName() { //getter 게터
		return this.name;	//read
	}
	
	/**
	 회원정보 보여주기
	 * */
	public String toString() {
		
		return String.format("이름:%s\n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호:%s",name,id,pass,ssn);
	}
}
