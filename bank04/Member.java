package bank04;

public class Member {
	String name,id,pass,ssn;
	Member(String name,String id,String pass,String ssn){
		this.name = name;
		this.id= id;
		this.pass= pass;
		this.ssn= ssn;
	}
	public String member() {
		String member = "";
		
		return String.format("이름:%s\n"
							+ "아이디:%s\n"
							+ "패스워드:%s\n"
							+ "주민번호:%s",name,id,pass,ssn);
	}
}
