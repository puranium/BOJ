import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int test_case = s.nextInt();
		s.nextLine();
		int sum = 0;
		// 숫자의 개수와 더한값을 담을 변수
		
		String num = s.nextLine();
		String[] numS = num.split("");
		int[] numi = Arrays.stream(numS).mapToInt(Integer::parseInt).toArray();
		// 입력
		
		for(int i=0; i<test_case; i++) {
			sum += numi[i];
		}
		
		System.out.println(sum);
		
	}

}
