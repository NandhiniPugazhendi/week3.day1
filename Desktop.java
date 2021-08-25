package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Size");
	}
	
	public static void main(String[] args) {
		
		Desktop systemObj = new Desktop();
		systemObj.computerModel();
		systemObj.desktopSize();
	}
}
