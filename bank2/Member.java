package bank2;

public class Member {
	String name,id,pass,ssn;
	Member(String name,String id,String pass,String ssn){
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.ssn = ssn;
		
	}
	public String member() {
		String member = "";
		return String.format("이름:%s\n"
							+ "ID:%s\n"
							+ "비밀번호:%s\n"
							+ "주민등록번호:%s",name,id,pass,ssn);
	}
}
