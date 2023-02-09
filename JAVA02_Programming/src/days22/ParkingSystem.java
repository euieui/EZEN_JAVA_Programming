package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Car implements Serializable{
	private String carNumber;
	private String enterDateTime;
	
	Car(String carNumber){
		this.carNumber = carNumber;  // 전달된 차번호를 멤버변수에 저장
		// "yyyy-MM-dd_HH:mm" 날짜 포맷을생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		// 캘린더에서 날짜를 얻어오고 Date 형식으로 저장
		Date now = Calendar.getInstance().getTime();
		// 날짜 포맷에 now 변수에 있는 날짜를 적용 -> "" 를 이어붙이기 해서 String 형으로변환
		String enterDT = sdf.format(now) + ""; // "2020-11-26_12:14"
		// String enterDt = String.valueOf(sdf.format(now));
		this.enterDateTime = enterDT;  // 오늘짜를 변형한 입차시간을 멤버 변수에 저장
		
	}
	public String toString() {
		return this.carNumber + " # " + this.enterDateTime;
	} // 12가1234 # 2020-07-07_14:30 출력
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) return false;
		Car target = (Car)obj;
		boolean result = this.carNumber.equals(target.carNumber);
		return result;
	} // 차넘버만 같으면 true
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getEnterDateTime() {
		return enterDateTime;
	}
	public void setEnterDateTime(String enterDateTime) {
		this.enterDateTime = enterDateTime;
	}
	public int payCount() throws ParseException {
		// this <- cars[k-1]
		// 현재시간 (출차시간) 생성(Calendar) - 입차시간 구하기 위한 동작
		
		// 출차 시간 : 현재시간 - > 밀리초로 환산
		// 입차 시간 : enterDateTime 변수값을 String -> Date 로 변환 -> 밀리초로 환산
		
		// (출차시간 밀리초 - 입차시간 밀리초)/1000 -> 초(second) 단위로 주차시간 계산
		// 주차비 계산 : 현재시간을 출차시간으로 하여 밀리초끼리의 뺄셈 연산 후 다시 시분초로 환산
		// 시간당 2000원, 10분당 400원
		int sum;
		
		// Car p = (Car) this; ///--- 이거 안해도 되나봐
		Date end = Calendar.getInstance().getTime();
		
		   ///--- yyyy-MM-dd_HH:mm   ///--- 내가생각한건 밀리초까지 못하는데 궁금하네
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		Date start = sdf2.parse(this.getEnterDateTime());
		int hour = (int) ((end.getTime()-start.getTime())/3600000);
		int min =    (int) (((end.getTime()-start.getTime())/60000) -  ( hour *60))/10;
		sum = hour * 2000 + (min+1)*400;
		return sum;

		
	}
}


public class ParkingSystem {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException{
		Scanner sc = new Scanner(System.in);
		File dir = new File("D:\\JAVA\\Java_se\\file\\parking");
		if (!dir.exists()) dir.mkdirs();
		File file = new File(dir,"parking.dat");
		
		ArrayList<Car> list; // 입차하는 차들이 저장될 리스트
		
		
		// 파일이 있으면 열어서 파일내용을 읽어서 리스트 저장, 최초 실행이라 파일이 없으면 새로 리스트 생성
		if(!file.exists())
			list = new ArrayList<Car>();
		else {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(file)));
			list = (ArrayList<Car>) ois.readObject();
			ois.close();
					
		}
		
		while(true) {
			System.out.printf("메뉴를 선택하세요\t\t");
			System.out.println("1. 입차\t2. 출차\t3. 주차상황\t4. 종료");
			System.out.printf("입력>> : ");
			int input;
			input =sc.nextInt();
			if (input == 4 ) break; // 4번 입력시 while 문 종료 리스트를 파일에 저장후 프로그램도 종료
			
			switch (input) {
				case 1:
					enterCar(list); break;
				case 2:
					outCar(list); break;
				case 3:
					prnList(list); break;
				// case 5:
					// for(int i=0 ; i<list.size(); i++)
						// list.get(i).setEnterDateTime("2021-08-17_10:00");  ///-- 자동차 입차시간 셋팅 계산편하게
			}
		}
		System.out.println("프로그램이 종료합니다");
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(list); // 주차중인 차를 담고 있는 리스트를 파일에 저장
		oos.close();

	}

	private static void outCar(ArrayList<Car> list) throws ParseException {
		// 리스트 사이즈가 0 이면 출차할 차가 없습니다 라는 메시지와 함께 메서드 종료
		if (list.size()==0) {
			System.out.println("출차할 차가 없습니다");
			return;
		}
		// 차량 번호 입력 (뒤 숫자 네자리만 입력)
		System.out.println("출차할 차의 차량번호 뒷자리 4자리를 입력하세요");
		Scanner sc = new Scanner (System.in);
		String num = sc.nextLine();
		
		// 차번호 검색후 같은 번호의 차량리스트 출력( 순번과 차량번호 선택)
		Car[] cars = new Car[10]; // 중복된 차량 리스트를 담을 배열
		for(int i = 0 ; i<list.size(); i++)
			if(list.get(i).getCarNumber().indexOf(num) != -1)
				//  num 값이 현재차의 번호의 일부로 존재 한다면..
				cars[i] = list.get(i);  // 현재 차량의 저장된 리스트 주소값을 cars 배열의 같은 위치에 저장
		if(cars.length == 0 ) {
			System.out.println("찾는 차량이 없습니다");
			return;
		}
		for(int i = 0 ; i<cars.length ; i++ ) {  
			if(cars[i] != null)  // cars 배열값들중 널이 아닌것들만 화면에 번호와 함께 출력
				System.out.println((i+1) + ". " + cars[i].toString());
			
		}
		//출력된 리스트(1개이상 )에서 출차할 차량의 순번 입력
		System.out.println("출차할 차의 주차 순번을 입력하세요");
		int k = sc.nextInt();
		
		// 요금계산
		int pay = cars[k-1].payCount(); // 요금계산
		// 요금출력
		System.out.println("주차 요금은 " +pay + "원입니다");
		//출 차
		list.remove(k-1);
		
	}

	private static void prnList(ArrayList<Car> list) {
		System.out.println("주차중인 차량 목록 -----------------");
		for(int i = 0 ; i <list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("\n");
		
	}

	private static void enterCar(ArrayList<Car> list) {
		// if 문과 list.size()를 이용하여 현재 주차중인 차의 갯수가 10대이면 만차
		// 더이상 주차 할수 없습니다 메세지와 함께 메서드 종료
		if(list.size()==10) {
			System.out.println("만차 더이상 주차할 수 없습니다.\n\n");
			return;
		}
		// 차령 번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입차 : 차량번호를 입력하세요");
		String num = sc.nextLine();
		// Car 객체 생성 : 생성자를 이용한 멤버 변수 초기화 기능 실행
		Car c = new Car(num);
		list.add(c);
	}

}
