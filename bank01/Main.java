package bank01;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {

			switch(JOptionPane.showInputDialog("[메뉴]0.정지\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.계좌보기")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" :
						String name=JOptionPane.showInputDialog("이름을 입력하세요");
						String id=JOptionPane.showInputDialog("ID을 입력하세요");
						String pass=JOptionPane.showInputDialog("비밀번호를 입력하세요");
						String ssn=JOptionPane.showInputDialog("주민번호을 입력하세요");
						 member = new Member(id, name, pass, ssn);

						JOptionPane.showMessageDialog(null,member.info());
						break;
					case "2" : 
						 account = new Account(0);
						JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");
						break;
					case "3" :
						
						JOptionPane.showMessageDialog(null,String.format("%s",account.accountsee(member.name)));
						break;

			}
		}
	}
}
