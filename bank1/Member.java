package bank1;

public class Member {
	String id,name,pass,ssn;
	
	Member(String id,String name,String pass,String ssn){
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.ssn = ssn;
	}
	public String info() {
		String info = "";
		
		return String.format("아이디:%s\n"
							+ "이름%s\n"
							+ "비밀번호%s\n"
							+ "주민번호%s\n",id,name,pass,ssn);
	}
}
