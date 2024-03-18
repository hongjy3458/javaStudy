package subway;

public class Subway {
	
	public Subway() {

	}
	
	public Subway(String name, String line, boolean isTransfer, char door, int congestion, int size) {
		this.name = name;
		this.line = line;
		this.isTransfer = isTransfer;
		this.door = door;
		this.congestion = congestion;
		this.size = size;
	}
	
	private String name; 		//역 이름
	private String line; 		//호선
	private boolean isTransfer; //환승역 여부
	private char door;			//문 열리는 곳	// R:오른쪽문 , L:왼쪽문
	private int congestion;		//혼잡도
	private int size;			//칸 길이
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public boolean isTransfer() {
		return isTransfer;
	}
	public void setTransfer(boolean isTransfer) {
		this.isTransfer = isTransfer;
	}
	public char getDoor() {
		return door;
	}
	public void setDoor(char door) {
		this.door = door;
	}
	public int getCongestion() {
		return congestion;
	}
	public void setCongestion(int congestion) {
		this.congestion = congestion;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return "Subway [name=" + name + ", line=" + line + ", isTransfer=" + isTransfer + ", door=" + door
				+ ", congestion=" + congestion + ", size=" + size + "]";
	}

}
