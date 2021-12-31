/*
 * 2017110729 이상현
 * 과제3 BankAccountApp.java 파일입니다.
 */
public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("ABC bank", 10000);
		bankAccount.menu();
	}
}