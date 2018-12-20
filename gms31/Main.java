package gms31;

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
						student.getHakbun(stservice.hakbun());
						student.getName(name);
						student.getSsn(ssn);
						student.getPass(pass);
						JOptionPane.showMessageDialog(null,"학생부가 등록되었습니다.");
						break;
					case "2" :	
						JOptionPane.showMessageDialog(null,student.toString(student.setHakbun(),
								student.setName(),student.setSsn(),student.setPass()));
						break;
					case "3" :
						
						student.getPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
						break;
					case "4" : 
						 subject = new SubjectBean();
						 
						
						subject.getSubjName(JOptionPane.showInputDialog("수강과목을 입력하세요"));
						break;
					case "5" :	
						subject.getProfName(JOptionPane.showInputDialog("교수이름을 입력하세요"));
						break;
					case "6" :
						subject.getScore(Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요")));
						break;
					case "7" :
						
						JOptionPane.showMessageDialog(null,subject.toString(subject.setSubjName(),
								subject.setProfName(),subject.setScore()));
						break;
					
			}
		}

	}
}



