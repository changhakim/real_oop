package gms21;

import javax.swing.JOptionPane;


public class Main {



	/**
			 성적표에 표시될 내용 :
			 학번(Student)
			 학생이름(Student)
			 과목명(Subject)
			 점수(Subject)
	 * */
	public static void main(String[] args) {
		StudentBean student = null;
		SubjectBean subject = null;
		StudentService stservice = new StudentService();
		SubjectService sbservice = new SubjectService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.학생부등록\n"
					+ "2.학생정보\n"
					+ "3.비번변경\n"
					+ "4.수강과목등록\n"
					+ "5.교수등록\n"
					+ "6.점수등록\n"
					+ "7.성적표보기")) {

					case "0" : JOptionPane.showMessageDialog(null,"종료..");return;
					case "1" : 
						String name = JOptionPane.showInputDialog("이름을 입력하세요");
						String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
						String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
						student = new StudentBean();
						student.setHakbun(stservice.hakbun());
						student.setName(name);
						student.setSsn(ssn);
						student.setPass(pass);
						JOptionPane.showMessageDialog(null,"학생부가 등록되었습니다.");
						break;
					case "2" :	
						JOptionPane.showMessageDialog(null,student.toString(student.getHakbun(),
								student.getName(),student.getSsn(),student.getPass()));
						break;
					case "3" :
						
						student.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
						break;
					case "4" : 
						 subject = new SubjectBean();
						 
						
						subject.setSubjName(JOptionPane.showInputDialog("수강과목을 입력하세요"));
						break;
					case "5" :	
						subject.setProfName(JOptionPane.showInputDialog("교수이름을 입력하세요"));
						break;
					case "6" :
						subject.setScore(Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요")));
						break;
					case "7" :
						
						JOptionPane.showMessageDialog(null,sbservice.info(student.getName(),student.getHakbun(),subject.getSubjName(),
								subject.getProfName(),subject.getScore()));
						break;
					
			}
		}

	}
}



