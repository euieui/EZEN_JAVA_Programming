package days22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
		// "D:\\JAVA\\Java_se\\temp\abc.txt" 파일의 내용을 읽어다가
		// 콘솔창에 출력하세요
		
		File dir = new File("D:\\JAVA\\Java_se\\temp");
		if(!dir.exists()) dir.mkdirs();
		
		File file_text = new File(dir, "abc.txt");
		FileReader abc = new FileReader(file_text);
		
		int data_text;
		while( (data_text = abc.read()) !=-1)
			System.out.print((char)data_text);
		abc.close();
		

	}

}
