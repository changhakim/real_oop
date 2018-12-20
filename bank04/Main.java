package bank04;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JOptionPane opt = new JOptionPane();
		Member member = null;
		Account account = null;
		while(true) {
		
			switch(	JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.계좌확인")) {
			case "0" :JOptionPane.showMessageDialog(null,"정지...");return;
			case "1" : 
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String id = JOptionPane.showInputDialog("아이디를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				String ssn = JOptionPane.showInputDialog(" 주민번호를 입력하세요");
				 member = new Member(name, id, pass, ssn);
				 
				 JOptionPane.showMessageDialog(null,String.format("%s",member.member()));
				 break;
			case "2" : 
				 account = new Account(0);
				 JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다");
			break;
			case "3" :
				
				JOptionPane.showMessageDialog(null,String.format("%s",account.accountsee(member.name)));
			}
		}
	}
}
