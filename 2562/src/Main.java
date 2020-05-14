import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[9];
		// 9개의 숫자를 담을 배열
		
		int max = 0;
		int seq = 0;
		// 최댓값을 저장할 변수 max
		// 최댓값이 몇번째인지 저장할 seq
		
		for(int i=0; i<9; i++) {
			arr[i] = s.nextInt();
			if(arr[i]>max) {
				max = arr[i];
				seq = i+1;
			}
		}
		// 숫자 담으며 탐색한 최댓값보다 큰 숫자가 나오면 max에 저장, seq에 순서저장
		
		System.out.println(max);
		System.out.println(seq);
		
	}

}
