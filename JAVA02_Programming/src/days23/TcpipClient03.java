package days23;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient03 {

	public static void main(String[] args) {
		String serverIp ="192.168.0.2";
		try {
			Socket s = new Socket(serverIp,5555);
			System.out.println("서버에 연결되었습니다.");
			Sender sender = new Sender(s); //--- 같은패키지니까 사용가능
			Receiver receive = new Receiver(s);
			sender.start();
			receive.start();
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} catch (Exception e) {e.printStackTrace();}

	}
	///--- 어이거 실행하면 클라이언트 쪽에 번호가 다르네 서버 포트 라고 해야하나??
	/// --- 랜덤으로 나올것 같은데 ㅎㅎ

}
