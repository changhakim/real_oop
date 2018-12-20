package gms21;

public class SubjectBean {
	private String subjName,profName;
	private int score;


	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfName() {
		return profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public String toString(String subjName,String profName,int score) {
		return String.format("과목이름:%s\n"
				+ "교수이름:%s\n"
				+ "점수:%d",subjName,profName,score);
	}
	
}

