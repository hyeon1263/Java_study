// Scanner로 입력받은 데이터를 파일에 저장하는 프로그램
import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("test1.txt");	 // 인자에 true를 추가하면 append모드
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0)	// 아무 입력없이 엔터키만 누른 경우
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);	// 줄 바꾸며 파일에 write
			}
			System.out.println("File close");
			fout.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		scanner.close();
	}
}