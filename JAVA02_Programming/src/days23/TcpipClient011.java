import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient011 {

	public static void main(String[] args) {
		
		/// -- ��ǥ���� ������ �ü���� ������  os ���ϴ°ű���! ��������
		/// --- ����ǻ�͵� ����Ʈ��� ������ ������ �� �� �ֵ�!
		
		String serverIp = "192.168.0.2";  
		try {
			// ������ �����Ǹ�, sc.nextInt() �� �Է��� ������ ��ٸ���, �����û�� ������ ��ٸ��ϴ�.   ///---- � Ŭ���̾�Ʈ�� �����Ҷ�����? 
			Socket s = new Socket(serverIp,6666);  /// ---- java ���� �����ϴ� Socket �̰Թ���    
																	/// ---- 7777 -> ��Ʈ��ȣ
			// Socket : Ŭ���̾�Ʈ�� ������ ��û�� ����Ʈ����
			// serverIp : Ŭ���̾�Ʈ�� ��û�� ������ ������ �ּ�
			// 7777 : �������� ������ ������ �׷��ȣ  ////--- �׷츶�� �ٸ��� ������ �ɷ���?
			
			// ������ �����ϸ� �Ʒ� ������ ����. �����ϸ� catch  ���� ����
			InputStream in = s.getInputStream();  // ���Ͽ��� �Է�/��� ��Ʈ���� ���޹޾� ����µ����� ���
			// InpuStream �� �ܼ� �ƽ�Ű�ڵ� ������� �����ڿ� ���� ����Ŭ���̾�Ʈ ��ſ� ��밡���� ��Ʈ���� �����մϴ�.
			DataInputStream dis = new DataInputStream(in);
			// ������ ��û�� ������ ���� ���޵� �޼����� �����մϴ�
			String m = dis.readUTF();
			// �������� ���� ���� �����͸� ����Ѵ�.
			System.out.println("���� �޼��� : " + m);
			System.out.println("������ �����մϴ�.");
			// ��Ʈ���� ������ �ݽ��ϴ�.
			dis.close();
			s.close();
			System.out.println("������ ����Ǿ����ϴ�.");
			
			
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}    
		

	}

}
