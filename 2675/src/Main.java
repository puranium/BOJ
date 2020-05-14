import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		// T는 test case 개수
		
		for(int i=0; i<T; i++) {
			int rep = s.nextInt();
			// rep는 반복할 횟수
			
			String str = s.nextLine();
			String[] arr_str = str.split("");
			// 문자열을 받아 arr_str에 나누어담음			
			
			for(int j=1; j<str.length(); j++) {
				for(int k=0; k<rep; k++) {
					System.out.print(arr_str[j]);	
				}
			}
			System.out.println();
		}
		
	}

}
