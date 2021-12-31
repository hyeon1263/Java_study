public class ArraySum {
	
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i=1; i<=10; i++) {
			sum += i;
			if (i<10)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
		}
		System.out.println(sum);
	}
}