package gms31;

public class StudentBean {
	private String hakbun,name,ssn,pass;
	
	
	public void getHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String setHakbun() {
		return hakbun;
	}
	public void getName(String name) {
		this.name = name;
	}
	public String setName() {
		return name;
	}
	public void getSsn(String ssn) {
		this.ssn = ssn;
	}
	public String setSsn() {
		return ssn;
	}
	public void getPass(String pass) {
		this.pass = pass;
	}
	public String setPass() {
		return pass;
	}
	public String toString(String hakbun,String name,String ssn,String pass) {
		return String.format("학번:%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s",hakbun,name,ssn,pass);
	}

	}
	

