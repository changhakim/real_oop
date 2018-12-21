package phone;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean move = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean android = null;
		while(true) {


			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.일반폰\n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드\n"
					+ "5.\n"
					+ "6.\n"
					+ "7.")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" : 
						 phone = new PhoneBean();
						phone.setKind(JOptionPane.showInputDialog("전화기 종류"));
						phone.setCompany(JOptionPane.showInputDialog("어느 회사 제품?"));
						phone.setCall(JOptionPane.showInputDialog("통화 내용"));
						
						JOptionPane.showMessageDialog(null,phone.toString());
						//종류:일반전화기
						//제조사:금성
						//통화내용:안녕
					case "2":
						move = new CelPhoneBean();
						move.setKind(JOptionPane.showInputDialog("전화기 종류"));
						move.setCompany(JOptionPane.showInputDialog("어느 회사 제품?"));
						move.setCall(JOptionPane.showInputDialog("통화 내용"));
						move.setMove(JOptionPane.showInputDialog("이동가능"));
						JOptionPane.showMessageDialog(null,phone.toString());
					case "3" :
						iPhone = new IPhoneBean();
						iPhone.setKind(JOptionPane.showInputDialog("전화기 종류"));
						iPhone.setCompany(JOptionPane.showInputDialog("어느 회사 제품?"));
						iPhone.setMove(JOptionPane.showInputDialog("이동가능"));
						iPhone.setData(JOptionPane.showInputDialog("검색어 입력"));
						JOptionPane.showMessageDialog(null,iPhone.toString());
						//종류:아이폰
						//제조사: 애플
						// 이동성 : 이동가능함
						//검색 : 노래검색
					case "4" : 
						android = new AndroidPhoneBean();
						android.setKind(JOptionPane.showInputDialog("전화기 종류"));
						android.setCompany(JOptionPane.showInputDialog("어느 회사 제품?"));
						android.setMove(JOptionPane.showInputDialog("이동가능"));
						android.setDisplay(JOptionPane.showInputDialog("몇인치?"));
						android.setData(JOptionPane.showInputDialog("검색어 입력"));
						
						JOptionPane.showMessageDialog(null,android.toString());
			}
		}
	}
}