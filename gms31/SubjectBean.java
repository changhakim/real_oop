package gms31;

public class SubjectBean {
	private String subjName,profName;
	private int score;


	public void getSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String setSubjName() {
		return subjName;
	}
	public void getProfName(String profName) {
		this.profName = profName;
	}
	public String setProfName() {
		return profName;
	}
	public void getScore(int score) {
		this.score = score;
	}
	public int setScore() {
		return score;
	}
	public String toString(String subjName,String profName,int score) {
		return String.format("과목이름:%s\n"
				+ "교수이름:%s\n"
				+ "점수:%d",subjName,profName,score);
	}
	
}

