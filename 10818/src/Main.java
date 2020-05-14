import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// n은 입력받는 숫자의 개수
		
		int[] arr = new int[n];
		// 입력받은 숫자를 저장할 배열
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		// 입력받은 숫자 저장
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length-1]);
		// 최소값 최대값 출력
	}

}
