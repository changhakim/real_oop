package gms21;

public class StudentBean {
	private String hakbun,name,ssn,pass;
	
	
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public String toString(String hakbun,String name,String ssn,String pass) {
		return String.format("학번:%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s",hakbun,name,ssn,pass);
	}

	}
	

