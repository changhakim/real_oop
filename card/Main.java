package card;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		CardBean cardBean = new CardBean();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.카드선택\n"
					+ "2.카드보기")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" : 
						//카드의 종류
						// 카드의 번호
						 cardBean = new CardBean();
						
						
						cardBean.setKind(JOptionPane.showInputDialog("카드종류를 입력하세요"));
						cardBean.setNumber(Integer.parseInt(JOptionPane.showInputDialog("번호를 입력하세요")));
						break;
					case "2" :
						//제출한 카드의 스펙
						
						JOptionPane.showMessageDialog(null,cardBean.toString());
						break;
			}
		}
	}
}


