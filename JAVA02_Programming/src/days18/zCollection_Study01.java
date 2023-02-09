package days18;

import java.util.Iterator;
import java.util.Vector;

public class zCollection_Study01 {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector<>();
		v.add(19);
		v.add(10);
		Iterator v1 = v.iterator();
		System.out.println(v.get(0) + v.get(1));  ///---- 저기 위에 Integer 안넣으면 .get이 안되는구나
		while(v1.hasNext()) {
			System.out.println(v1.next());  //// ---- for 문으로는 안되는건가?
		}
		
		
	}

}
