package days23;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient01 {

	public static void main(String[] args) {
		
		/// -- 대표적인 서버용 운영체제는 리눅스  os 말하는거구나! 리눅스가
		/// --- 내컴퓨터도 소프트웨어가 있으면 서버가 될 수 있따!
		
		String serverIp = "192.168.0.2";  
		try {
			// 소켓이 생성되면, sc.nextInt() 가 입력을 무한히 기다리듯, 연결요청을 무한히 기다립니다.   ///---- 어떤 클라이언트가 연결할때까지? 
			Socket s = new Socket(serverIp,7777);  /// ---- java 에서 제공하는 Socket 이게뭘까    
																	/// ---- 7777 -> 포트번호
			// Socket : 클라이언트가 연결을 요청할 소프트웨어
			// serverIp : 클라이언트가 요청할 연결의 목적지 주소
			// 7777 : 서버에서 관리할 연결의 그룹번호  ////--- 그룹마다 다르게 설정이 될려나?
			
			// 연결이 성공하면 아래 문장을 실행. 실패하면 catch  구문 실행
			InputStream in = s.getInputStream();  // 소켓에서 입력/출력 스트림을 전달받아 입출력도구로 사용
			// InpuStream 의 단순 아스키코드 입출력을 생성자에 넣은 서버클라이언트 통신에 사용가능한 스트림을 생성합니다.
			DataInputStream dis = new DataInputStream(in);
			// 연결을 요청한 서버로 부터 전달된 메세지를 저장합니다
			String m = dis.readUTF();
			// 소켓으로 부터 받은 데이터를 출력한다.
			System.out.println("받은 메세지 : " + m);
			System.out.println("연결을 종료합니다.");
			// 스트림과 소켓을 닫습니다.
			dis.close();
			s.close();
			System.out.println("연결이 종료되었습니다.");
			
			
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}    
		

	}

}
