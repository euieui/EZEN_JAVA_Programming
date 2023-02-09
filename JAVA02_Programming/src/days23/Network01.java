package days23;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network01 {

	public static void main(String[] args) {
		// IP 주소 : 네트워크에 접속되어 있는 (또는 인터넷에 연결되어 있는) 각 컴퓨터 들이
		//               서로를 구분하기 위해 지정된 숫자로 된 위치 정보(주소)
		
		/// --- 0~255 까지 숫자가 나올수 있다
		/// --- 23.249.120.58 IPv4
		/// ---   IPv6 6개인가?
		
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.daum.net");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() :" + ip.toString());
		} catch (UnknownHostException e) {e.printStackTrace();}
		
		try {
			ip = InetAddress.getLocalHost(); // LocalHost : 내컴퓨터
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			//  로컬호스트의 대표 아이피 : 127.0.0.1
			//  http://localhost    http://127.0.0.1    http://192.168.0.20    ////-----    http://localhost    http://127.0.0.1 이건 자기자신 컴퓨터
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
