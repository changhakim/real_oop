package phone;

public class AndroidPhoneBean extends IPhoneBean{
	private String display;
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}
	
	
	
	
	
	@Override
	public String toString() {

		return String.format("종류:%s\n"
				+ "제조사:%s\n"
				+ "이동가능:%s\n"
				+ "검색:%s\n"
				+ "큰화면%s", super.getKind(),super.getCompany(),super.getMove(),
				display,super.getData());	
	}
}
