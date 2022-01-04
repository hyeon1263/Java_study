
public class StringCompare {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "C++";
		
		int res = str1.compareTo(str2);
		if (res == 0)
			System.out.println("the same");
		else if (res < 0)
			System.out.println(str1 + " < " + str2);
		else
			System.out.println(str1 + " > " + str2);
	}
}