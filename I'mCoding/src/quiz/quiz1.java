package quiz;

public class quiz1 {

	public static void main(String[] args) {
		// 버스 도착 정보를 출력하는 프로그램을 작성하세요.
		//각 정보는 적절한 자료형의 변수에 정의 합니다.
		/* 정보 버스번호는 "1234", "상암08" 과 같은 형태
		 * 남은시간은 분 단위 (예: 3분, 5분)
		 * 남은 거리는 km 단위 (예: 1.5km, 0.8km)
		 */
		
		//버스 번호
		int busNo = 1234;
		String busNo1 = "동작01";
		//남은 시간
		int min = 3;
		int min2 = 5;
		//남은 거리
		double dis = (double)1.5;
		double dis2 = (double)0.8;
		
		System.out.println(busNo1 + "," + busNo + "번 버스");
		System.out.println("약 " + min + "분 후 도착");
		System.out.println("약 " + min2 + "분 후 도착");
		System.out.println("남은 거리 " + dis + "km");
		System.out.println("남은 거리 " + dis2 + "km");
		
	}

}
