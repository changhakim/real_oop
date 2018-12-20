package tv;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		TvBean tvBean = new TvBean();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.TV스펙입력\n"
					+ "2.TV정보보기")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" : 
						 tvBean = new TvBean();
						 tvBean.setBrand(JOptionPane.showInputDialog("브랜드를 입력하세요"));
						 tvBean.setColor(JOptionPane.showInputDialog("색상을 입력하세요"));
						 tvBean.setPrice(Integer.parseInt(JOptionPane.showInputDialog("가격을 입력하세요")));
					//brand color price 입력함
					// TV 브랜드
					// TV 색상
					// 가격
					break;
					case "2" :
						JOptionPane.showMessageDialog(null,tvBean.toString());
						//TV스펙
						break;
			}
		}
	}
}
