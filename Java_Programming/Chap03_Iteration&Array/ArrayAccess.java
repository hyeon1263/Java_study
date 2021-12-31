import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		int myArray[] = intArray;
		
		System.out.println("양수 5개를 입력하세요. ");
		for (int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		for (int i=0; i<4; i++) {
			System.out.print(intArray[i] + ", ");
		}
		System.out.println(intArray[4] + " 중에서 가장 큰 값은 " + max + "입니다.");
		for (int i=0;i<5;i++)
			System.out.print(myArray[i] + " ");
		sc.close();
	}
}
