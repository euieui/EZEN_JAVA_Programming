package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		// "D:\\JAVA\\Java_se\\temp" 폴더안의 "eclipse-inst-jre-win64.exe" 파일을
		// "D:\\JAVA\\Java_se\\copy" 폴더로 복사
		// 이진 형식으로 읽어... 바로 써넣ㅇ는 방식
		
		// BufferedInputStream    BufferedOutputStream
		/*
		File dir = new File("D:\\JAVA\\Java_se\\temp");
		if (!dir.exists()) dir.mkdirs();
		File file_binary = new File(dir, "eclipse-inst-jre-win64.exe");
		BufferedOutputStream bos_binary = new BufferedOutputStream(new FileOutputStream(file_binary));
		BufferedInputStream bis_bynary = new BufferedInputStream (new FileInputStream(file_binary));
		
		File dir2 = new File("D:\\JAVA\\Java_se\\copy");
		if (!dir2.exists()) dir.mkdirs();
		*/
		
		String CopyPath = "D:\\JAVA\\Java_se\\copy";
		String OriginalPath = "D:\\JAVA\\Java_se\\temp";
		String Filename = "eclipse-inst-jre-win64.exe";
		
		File originDir = new File(OriginalPath);  // 경로 설정
		File fileOriginal = new File(originDir,Filename); // 파일 설정
		
		File copyDir = new File(CopyPath); // 경로 설정
		if(!copyDir.exists()) copyDir.mkdirs(); // 경로 생성
		File fileCopy = new File(copyDir,Filename); // 파일 설정
		
		BufferedInputStream bis = new BufferedInputStream( new FileInputStream(fileOriginal));
		BufferedOutputStream bos = new BufferedOutputStream ( new FileOutputStream(fileCopy));
		
		// int data;
		// while( (data = bis.read()  )   != -1   ) bos.write(data);    ///---- 1byte 씩 읽음
		byte [] data = new byte[1024];
		int size; /// 1kbyte 가 아닐때 짜투리도 ? 이해안되는데
		while( (size = bis.read(data)) != -1) bos.write(data,0,size);   //// ---- 1kbyte 씩 읽음   ////--- 근데 byte [] data가 최대치가 있겠다?  
																								//// --- bos.write(data,0,size) 가 뭔지 잘 모르겠네
		
		bis.close();
		bos.close();
		
		/// ---- 이게 된다고 ????
	}

}
