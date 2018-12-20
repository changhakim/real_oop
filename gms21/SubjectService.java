package gms21;

public class SubjectService {
	
		public String info(String name,String hakbun,String subjName,String profName,int score) {
			return String.format("이름:%s\n"
					+ "학번:%s\n"
					+ "과목이름:%s\n"
					+ "교수이름:%s\n"
					+ "점수:%d",name,hakbun,subjName,profName,score);
		}
	}

