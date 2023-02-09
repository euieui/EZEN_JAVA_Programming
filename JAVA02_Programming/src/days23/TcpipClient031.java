import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient031 {

	public static void main(String[] args) {
		String serverIp ="192.168.0.2";
		try {
			Socket s = new Socket(serverIp,5555);
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(s); //--- ������Ű���ϱ� ��밡��
			Receiver receive = new Receiver(s);
			sender.start();
			receive.start();
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} catch (Exception e) {e.printStackTrace();}

	}

}
