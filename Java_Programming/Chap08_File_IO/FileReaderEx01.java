// 파일 전체를 읽어 화면에 출력하는 코드
import java.io.*;

public class FileReaderEx01 {

	public static void main(String[] args) {
		try {	// 파일 입출력은 반드시 예외처리를 추가해주어야 한다
			FileReader fin = new FileReader("test.txt");
			int c;
			while ((c = fin.read()) != -1) { // 파일 끝을 만나면 -1 반환
				System.out.print((char)c);
			}
			fin.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}