package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null; //bean객체
		AccountBean account = null;
		/**
		 서비스만  서비스타입으로 인터페이스를 정의해주고 생성자가있는곳으로 정의
		 * */
		AccountService service = new AccountServiceImpl(); // 서비스객체
		MemberService memberService = new MemberServiceImpl();
		while(true) {


			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌생성\n"
					+ "4.계좌확인\n"
					+ "5.입금\n"
					+ "6.출금"
					+ "7.비밀번호 변경")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" : 

						member = memberService.join(JOptionPane.showInputDialog("이름을 입력하세요"),
								JOptionPane.showInputDialog("아이디를 입력하세요"),
								JOptionPane.showInputDialog("주민번호를 입력하세요"),
								JOptionPane.showInputDialog("비밀번호를 입력하세요"));
						break;
					case "2" :
						JOptionPane.showMessageDialog(null,member.toString());
						break;
					case "3" :
						account = new AccountBean();

						account.setAccountNum(service.accountNum());

						account.setToday(service.today());

						account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금")));

						JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");

						break;
					case "4":
						
						JOptionPane.showMessageDialog(null,service.info(member.getName(),
								account.getAccountNum(),
								account.getToday(), 
								account.getMoney()));
						break;
					case "5":
						String deposit = JOptionPane.showInputDialog("금액을 입력하세요");


						//JOptionPane.showMessageDialog(null,account.deposit(Integer.parseInt(deposit)));

						break;
					case "6":
						String withDraw = JOptionPane.showInputDialog("금액을 입력하세요");

						//JOptionPane.showMessageDialog(null,account.withDraw(Integer.parseInt(withDraw)));


						break;
					case "7" :
						String passchange = JOptionPane.showInputDialog("바꿀 비밀번호를 입력하세요");
						member.setPass(passchange);
						break;
			}


		}
	}
}
