
public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		System.out.println("temp:       " + temp);
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		System.out.println("intArray:   " + intArray);
		
		for (int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" ");
	}
}