// 블록 단위로 바이너리 파일 고속 복사
import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		String org_img = "c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg";
		String copy_img = "c:\\Temp\\copyimg2.jpg";
		File src = new File(org_img);
		File dest = new File(copy_img);
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10]; // 10KB 버퍼 (한번에 읽어올 크기)
			
			while(true) {
				int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
				if(n <buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + 
							dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}