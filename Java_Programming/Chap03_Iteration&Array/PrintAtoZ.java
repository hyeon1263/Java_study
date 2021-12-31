public class PrintAtoZ {

	public static void main(String[] args) {
		char c = 'a';
		while (c <= 'z') {
			System.out.printf("%c: %d\n", (char)c, (int)c);
			c += 1;
		}
	}
}
