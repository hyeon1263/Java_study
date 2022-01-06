// 문자열을 입력받아 ArrayList에 저장
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요>> ");
			String s = sc.next();
			strList.add(s);
		}
		for (int i=0; i<strList.size(); i++) {
			String name = strList.get(i);
			System.out.print(name + ", ");
		}
		
		int longestIndex = 0;
		for (int i=1; i<strList.size(); i++) {
			if (strList.get(longestIndex).length() < strList.get(i).length())
				longestIndex = i;
		}
		System.out.println("");
		System.out.println("가장 긴 이름은 : " + strList.get(longestIndex));
		sc.close();
	}
}