/*
 * 2017110729 이상현
 * 과제 #02
 */
public class MinMax {

	public static void main(String[] args) {
		int count = 0;
		boolean is_prime;
		int[] array = new int[10];
		int min = 100;
		int max = 0;
		
		do {
			is_prime = true;
			int r = (int)(Math.random() * 100 + 1);
			for (int i=2; i<r; i++) {
				if (r%i==0) {
					is_prime = false;	// r이 i로 나누어지면 소수가 아님 
					break;
				}
			}
			if (is_prime)
				array[count++] = r;	 // 소수이면 배열에 넣어준다.
		} while (count < 10);
		
		for (int i=0; i<array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println("\n최대값: " + max + ", 최소값: " + min);
	}
}