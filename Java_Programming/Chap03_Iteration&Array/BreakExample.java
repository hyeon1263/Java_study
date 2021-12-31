import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while (true) {
			System.out.print(">>");
			String text = sc.nextLine();
			if (text.equals("exit")) // text와 "exit"가 같으면 true반환
				break;
		}
		System.out.println("종료합니다...");
		sc.close();
	}
}