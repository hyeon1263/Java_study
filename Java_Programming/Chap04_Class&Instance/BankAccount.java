/*
 * 2017110729 이상현
 * 과제3 BankAccount.java 파일입니다.
 */
import java.util.Scanner;

public class BankAccount {
	//Scanner scanner;
	
	int initMoney;
	String bankName;
	
	public BankAccount(String bankName, int initMoney) {
		this.initMoney = initMoney;
		this.bankName = bankName;
		//scanner = new Scanner(System.in);
	}
	
	public void readBalance() { 
		System.out.println("---------------------------");
		System.out.println(bankName + " 현금 입출금 프로그램");
		System.out.println("현재 통장 잔고: " + initMoney);
		System.out.println("---------------------------");
		System.out.print("1.입금 \n2.출금 \n3.계좌조회 \n4.종료 \n>> ");
	}
	
	public void deposit(int money) {
		if (money % 10000 != 0) {
			System.out.println("오류: 10000원 단위의 금액을 입력하세요");
		}
		else {
			initMoney += money;
		}
	}
	
	public void withdraw(int money) {
		if (money % 10000 != 0) {
			System.out.println("오류: 10000원 단위의 금액을 입력하세요");
		}
		else {
			if (money > initMoney) {
				System.out.println("---------------------------");
				System.out.println("잔액이 모자랍니다.");
			}
			else {
				initMoney -= money;
			}
		}
	}
	
	public void showBalance() {
		System.out.println("---------------------------");
		System.out.println(bankName + " 의 잔액: " + initMoney);
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int input;
		while (true) {
			readBalance();
			
			input = scanner.nextInt();
			if (input == 1) {
				System.out.print("입금금액: ");
				int money = scanner.nextInt();
				deposit(money);
			}
			else if (input == 2) {
				System.out.print("출금금액: ");
				int money = scanner.nextInt();
				withdraw(money);
			}
			else if (input == 3) {
				showBalance();
			}
			else if (input == 4)
			{
				System.out.println(bankName + "종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
		scanner.close();
	}
}
