package bank11;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService service = new AccountService();
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
						String name = JOptionPane.showInputDialog("이름을 입력하세요");
						String id = JOptionPane.showInputDialog("아이디를 입력하세요");
						String pass = JOptionPane.showInputDialog("주민번호를 입력하세요");
						String ssn = JOptionPane.showInputDialog("비밀번호를 입력하세요");
						member = new MemberBean();
						member.setName(name);
						member.setId(id);
						member.setPass(pass);
						member.setSsn(ssn);
						break;
					case "2" :
						JOptionPane.showMessageDialog(null,member.toString());
						break;
					case "3" :
						account = new AccountBean();
						String accountNum = service.accountNum();
						account.setAccountNum(accountNum);
						String today = service.today();
						account.setToday(today);
						int imoney = Integer.parseInt(JOptionPane.showInputDialog("입금"));
						account.setMoney(imoney);

						JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");

						break;
					case "4":
						String info = service.info(member.getName(),account.getAccountNum(),
								account.getToday(), account.getMoney());
						JOptionPane.showMessageDialog(null,info);
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
