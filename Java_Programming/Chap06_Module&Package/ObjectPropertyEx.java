class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Object.toString()메서드 오버라이딩
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	/*
	 * 객체 비교를 위한 equals메서드 오버라이딩(재정의)
	 */
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if (x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}

public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p);
		System.out.println(p+"입니다.");
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		// 객체 비교
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}
}