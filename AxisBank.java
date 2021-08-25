package week3.day1.org.system;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit = 20,000");
	}
	
	public static void main(String[] args) {
		AxisBank bankinfo = new AxisBank();
		bankinfo.deposit();
		bankinfo.saving();
		bankinfo.fixed();
	}
}
