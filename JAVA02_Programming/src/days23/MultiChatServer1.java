import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer1 {
	HashMap clients; // �������� Ŭ���̾�Ʈ �� ������� ������ ����Ʈ
	// key : Ŭ���̾�Ʈ�� �̸� - Ŭ���̾�Ʈ ���Ӱ� �Բ� ���޵� �̸� : ���ڷ� ������
	// Value : Ŭ���̾�Ʈ�� ����� �̸�(key��)���� ������ out ��ü. key ���� Ŭ���̾�Ʈ ���� ���۰�ü
	// �ؽ��ʿ� ����� Ŭ���̾�Ʈ���� out ��ü�� �ϳ��� ������ �ѻ���� �����޼����� ��ο��� �������ݴϴ�.
	MultiChatServer1(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// ��Ƽ ������ ȯ�濡�� ���� �ؽ��ʿ� ��Ƽ�����尡 ���� �����Ͽ� ���� �����ϴ°��� ���� ����ȭ ����
	}

	// Ŭ���� ���ο� �����ϴ� Ŭ����
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		ServerReceiver(Socket s){
			socket = s;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());  ///--- �ް� ������ �ϴϱ� Output�� �ʿ���
				// �ۼ����� ���� ��ü ����(������)
				
			} catch (IOException e) {System.out.println("�ۼ��Ű�ü ������ �����߽��ϴ�.");}
		}
		public void run() {
			String name = "";
			try { 
				// ���Ӱ� �Բ� ���޵� �̸��� ����
				name = in.readUTF();
				// ����� Ŭ���̾�Ʈ�� �ؽ��ɿ� ����
				clients.put(name, out); // �ؽ��ʿ� Ŭ���̾�Ʈ �Ѹ� �߰� (Ű: �̸� , ���� : out ��ü)
				sendToAll("#"+name+"���� �����̽��ϴ�."); // �̸��� ���(��� Ŭ���̾�Ʈ����)
				System.out.println("���� ���������� ���� " + clients.size()+"�Դϴ�.");
				// ��Ư�� ��ȭ�����ڵ��� ������ �͵��� ��ο��� ����....(���ѹݺ�-���� �������� ���ΰ��� ����������)
				while(in != null) sendToAll(in.readUTF());
			} catch (IOException e) {e.printStackTrace(); 
			} finally {
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				clients.remove(name); // �ؽ��ʿ��� ���� ����� ����
				System.out.println("["+socket.getInetAddress() + ":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
				System.out.println("���� ���������� ���� "+ clients.size() + "�Դϴ�.");
			}
		}
	}
	public void sendToAll(String msg) {
		// �ؽ����� Ű�鿡 ���ʷ� ������ �� �ִ� ���ͷ����� ����
		Iterator it = clients.keySet().iterator();
		while(it.hasNext()) { // ���� Ű���� �ֵ��� true �� �ݺ�, Ű���� ���������� �ٴٸ������� �ݺ�����
			
			try {
				// clients���� (next)Ű������ �� Value(Ŭ���̾�Ʈ ���� out ��ü)�� ������ out�� ����
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);// �ؽ��ʿ��� ������ out ��ü�� ���� �޼��� ����
			} catch (IOException e) {e.printStackTrace();} 
			
		}
	}
	
	public void sijack() {
		// ���������� �ϰ� Ŭ���̾�Ʈ ������ ��ٸ��ϴ�.
		// Ŭ���̾�Ʈ�� ������ �Ǹ� ����� ������ ���� ��������� ServerReceiver ��ü�� �����ϰ�,
		// �� ���ῡ ���� �����尡 start �˴ϴ�.
		// �׸��� ���� ������ ��ٸ��ϴ�.
		// �ο��� ���Ѿ��� ����ǰ�, ���� �������� �������� �ۼ����մϴ�.
		ServerSocket ss = null; // Ŭ���̾�Ʈ��� ������ ����
		Socket s =null; // �� Ŭ���̾�Ʈ �� ��� ����
		try {
			while(true) {   ///---- try �ȿ� ���� ������ ����? ������ ����ų� ����¼�� �ߴµ� ���α׷��� ���� �ع�������?
				ss = new ServerSocket(9999);
				System.out.println("������ ���۵Ǿ����ϴ�.");
				s = ss.accept();
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"]"+"���� �����Ͽ����ϴ�.");
				ServerReceiver th = new ServerReceiver(s);
				// �� �����ϴ� Ŭ���̾�Ʈ ���� ���ο� ���ϰ� �����尡 �����Ǹ� ���� ������ �ۼ����� �����ϰ� �մϴ�.
				th.start(); // ������ ����
			}
		} catch (IOException e) {e.printStackTrace();}
		
		
	}
	
	public static void main(String[] args) {
		MultiChatServer1 k = new MultiChatServer1();
		k.sijack();

	}


	

}

