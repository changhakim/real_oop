package car;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CarBean car = new CarBean();
		while(true) {


			switch(JOptionPane.showInputDialog("0.정지\n"
					+ "1.차량정보기입\n"
					+ "2.차량정보보기")) {
					case "0" : JOptionPane.showMessageDialog(null,"정지..");return;
					case "1" :
						car = new CarBean();
						car.setGearType(JOptionPane.showInputDialog("어떤기어를 원하시나요 오토/수동"));
						car.setColror(JOptionPane.showInputDialog("원하시는 색깔을 입력하세요"));
						car.setDoor(Integer.parseInt(JOptionPane.showInputDialog("원하시는 문의 개수를 입력하세요")));
						break;
					case "2" : 
						JOptionPane.showMessageDialog(null,car.toString());
						break;	

			}
		}
	}
}
