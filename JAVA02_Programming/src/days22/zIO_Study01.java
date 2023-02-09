package days22;

import java.io.File;

public class zIO_Study01 {

	public static void main(String[] args) {
		File dir = new File("D://JAVA//Practice");
		if (!dir.exists()) dir.mkdirs();
		File name = new File(dir,"MY_Practice.txt");
		

	}

}
