import java.util.Scanner;

public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형의 너비와 높이 입력>> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
}