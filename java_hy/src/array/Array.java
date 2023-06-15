package array;

public class Array {

	public static void printArray (int arr[]) {
		//배열 전체 출력
		System.out.print("[");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length-1?"":", "));
		}
		System.out.println("]");
	}
	//배열을 start번지부터 end-1번지까지 출력
	public static void printArray (int arr[], int start, int end) {
		System.out.print("[");
		for(int i = start; i<end; i++) {
			if(i >= arr.length) {
				break;
			}
			System.out.print(arr[i] + (i == end-1?"":", "));
		}
		System.out.println("]");
	}
	//num가 배열의 원소 중에서 0번지부터 count개 안에 있는지 확인하는 메서드
	public static boolean contains(int arr[], int num, int count) {
		for(int i = 0; i < count; i++) {
			//중복되면 메서드를 종료하며서 중복됐따고 알려줌.
			if(num == arr[i]) {
				return true;
			}
		}
		//이 위치까지 왔다는건 return true를 못 만났다는 뜻이고,
		//그 말은 중복되지 않았다는 뜻
		return false;
	}
	/** min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수 : 최소값, 최대값, 배열 => int min, int max, int arr[]
	 * 리턴타입 : 없음
	 * 매서드명 : createRandomArray
	 */
	public static int [] createRandomArray (int min, int max, int arr[]) {
		//max가 min보다 작으면 두 수를 교환
		if(max < min) {
			int tmp = max;
			max = min;
			min = max;
		}
		//배일이 생성되어 있지 않으면(배열이 null이면) 메서드 종료
		if(arr == null) {
			arr = new int[max - min + 1];
		}
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드를 종료
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return null;
		}
		int count = 0;
		while(count < arr.length) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장후 count 증가
			if(!contains(arr, random, count)) {
				arr[count] = random;
				count++;;
			}			
		}
		return arr;
	}
}