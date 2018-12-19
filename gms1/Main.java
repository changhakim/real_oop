package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Student student = null;
		while(true) {
			
			
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.정지\n"
					+ "1.학생정보입력")) {
			case "0" : JOptionPane.showMessageDialog(null,"0.정지..");return;
			case "1" : 
				String hakbun = JOptionPane.showInputDialog("학번을 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호을 입력하세요");
				 student = new Student(hakbun, name, ssn, pass);
				 JOptionPane.showMessageDialog(null,String.format("%s",student.info()));
			}
		}
	}
}
