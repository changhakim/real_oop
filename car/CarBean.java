package car;

public class CarBean {

	private String color , gearType; //오토는 수동이냐 자동이냐
	private int door;//문의 갯수 


	public void setColror(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getGearType() {
		return gearType;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	public String toString() {
		
		return String.format("기어타입:%s\n"
				+ "차량컬러:%s"
				+ "문개수:%d",gearType,color,door);
	}
}
