import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			String name = scanner.next();
			System.out.print("Name: " + name + ", ");
			
			String city = scanner.next();
			System.out.print("City: " + city + ", ");
			
			int age = scanner.nextInt();
			System.out.print("Age: " + age + ", ");
			
			double weight = scanner.nextDouble();
			System.out.print("Weight: " + weight + ", ");
			
			boolean single = scanner.nextBoolean();
			System.out.println("Marriage: " + single);
		}
		scanner.close();
	}
}
