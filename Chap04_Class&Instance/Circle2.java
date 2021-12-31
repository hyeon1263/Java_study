// 객체 배열 선언 및 생성

public class Circle2 {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];	// 배열 생성
		
		for (int i=0; i<c.length; i++) {
			c[i] = new Circle(i);   // 객체 생성
			System.out.print((int)c[i].getArea()+" ");
		}
	}
}