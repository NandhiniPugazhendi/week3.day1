package week3.day1.org.system;

public class Students {

	public void getStudentInfo() {
		System.out.println("Student Information");		
	}
	public void getStudentInfo(int id) {
		System.out.println("Student Id:" + id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Id:" + id + "Name:" + name);
	}
	public void getStudentInfo(String emailid) {
		System.out.println("Student Emailid:" + emailid );
	}
	public void getStudentInfo(String emailid, int phonenumber) {
		System.out.println("Student Email:" + emailid + "Phone Number:" + phonenumber);
	}
	
	public static void main(String[] args) {
		Students information = new Students();
		information.getStudentInfo(1234);
		information.getStudentInfo(1234, "Nandhini");
		information.getStudentInfo("nandhinipugazh52@gmail.com");
		information.getStudentInfo("nandhinipugazh52@gmail.com", 741825694);
	}
}
