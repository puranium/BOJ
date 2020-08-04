import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] des = {8, 7, 6, 5, 4, 3, 2, 1};
		// 입력과 비교할 배열
		
		int first = s.nextInt();
		// 처음 하나을 보고 판단
		
		if(first != 1 && first != 8) {
			System.out.println("mixed");
		}
		else if(first == 1) {
			boolean as = true;
			for(int i=1; i<8; i++) {
				if(s.nextInt() != asc[i]) {
					as = false;
					System.out.println("mixed");
					break;
				}
			}
			if(as == true) {
				System.out.println("ascending");
			}
		}
		else {
			boolean ds = true;
			for(int i=1; i<8; i++) {
				if(s.nextInt() != des[i]) {
					ds = false;
					System.out.println("mixed");
					break;
				}
			}
			if(ds == true) {
				System.out.println("descending");
			}
		}
		
	}

}
