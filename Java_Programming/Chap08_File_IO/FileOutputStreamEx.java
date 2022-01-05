// FileOutputStream으로 byte[] 배열 속 바이너리 값을 test.out파일에 저장하기
import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte  b[] = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
			for (int i=0; i<b.length; i++)
				fout.write(b[i]);
		
			fout.close();
		} catch(IOException e) {
			System.out.println("test.out을 저장할 수 없습니다. "
									+ "경로명을 확인해주세요.");
			return;
		}
		System.out.println("test.out을 저장하였습니다. ");
	}
}