package days22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IO18 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File dir = new File("D:\\JAVA\\Java_se\\temp");
		if (!dir.exists()) dir.mkdirs();
		File file = new File(dir, "Point.dat");
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)));
		ArrayList<Point> list = (ArrayList<Point>)ois.readObject();  ///--- 객체를 집어 넣어야 하는데 하나씩!!!!  그걸 타입 캐스팅!!
		
		for( int i = 0 ; i<list.size(); i++) {
			System.out.printf("%s ",list.get(i).toString());
			if((i+1)%8 ==0) System.out.println();
		}
		

	}

}
