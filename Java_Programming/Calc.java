
public class Calc {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);
			// parseDouble: 주어진 문자열을 double형으로 변환
		System.out.println("sum = " + sum);
	}

}
