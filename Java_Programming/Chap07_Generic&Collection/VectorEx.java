// 정수만 다루는 Vector<Integer> 컬렉션 예시
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2);
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);	// index[2] 자리에 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수: " + v.size());
		System.out.println("벡터의 현재 용량: " + v.capacity());
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + ", ");
		}
		System.out.println();

		for(Integer i : v) {
			System.out.print(i + ", ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("정수의 합: " + sum);
	}
}