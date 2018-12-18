package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			
			switch(JOptionPane.showInputDialog("[메뉴]/n"
					+ "0.정지\n"
					+ "1.계좌생성\n"
					+ "2.계좌확인")) {
			
			case "0" : JOptionPane.showMessageDialog(null,"정지..");return;
			case "1" : 
				String name= JOptionPane.showInputDialog("이름을 입력하세요");
				String id= JOptionPane.showInputDialog("아이디을 입력하세요");
				String pass= JOptionPane.showInputDialog("비밀번호을 입력하세요");
				String ssn= JOptionPane.showInputDialog("주민번호을 입력하세요");
				
				Member member = new Member(name, id, pass, ssn);
				JOptionPane.showMessageDialog(null,String.format("%s",member.member()));
				break;
			
			}
		}
	}

}
