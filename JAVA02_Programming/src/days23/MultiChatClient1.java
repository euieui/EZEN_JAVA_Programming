import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiChatClient1 {

	public static void main(String[] args) {
		/// --- args �� �迭�̾�
		// for(int i = 0 ; i <args.length ; i ++) {
		//	 System.out.println(args[i]);
		// }
		
		String serverIp="192.168.0.2";
		try {
			Socket s = new Socket(serverIp,9999);
			System.out.println("������ ����Ǿ����ϴ�.");
			ClientSender cs = new ClientSender(s,args[0]);  ///--- ó���� ���� �̸������� ���� �װ� �̸��� �Ǵ±��� name
			ClientReceiver cr= new ClientReceiver(s);
			cs.start();
			cr.start();
		} catch (UnknownHostException e) {
			System.out.println("�ش� �������� ����(ȣ��Ʈ)�� ã�� �� �����ϴ�.");
			System.exit(0);
		} catch (IOException e) {  ///-- �̰� ���� ����ó���ϱ�
			System.out.println("�ش� �������� ����(ȣ��Ʈ)�� ���ῡ �����߽��ϴ�.");
			System.exit(0);
		}
	}  //---- main ��
	
	
	
	///------- static class ���� -----
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		ClientSender(Socket s,String name){
			this.socket = s;
			this.name = name;
			try {
				this.out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {e.printStackTrace();}
		}
		public void run() {
			Scanner sc = new Scanner(System.in);
			if( out != null) {
				try {
					out.writeUTF(name); // ���� ���ӽ� �̸��� ������ ����
					while( out != null) out.writeUTF("["+name+"]" + sc.nextLine());
					// ���� ȭ�鿡 ���� ������ ��� ������ ����(���α׷� ����ñ��� ���� �ݺ�)
				}catch(IOException e) {}
			}
		}
	}
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		ClientReceiver(Socket s){
			this.socket = s;
			try {
				this.in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {e.printStackTrace();}
		}
		public void run() {
			while (in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {e.printStackTrace();}
			}
		}
	}
 
}
