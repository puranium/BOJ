import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		s.nextLine();
	
		String[][] chess = new String[n][m];
	
		for(int nn = 0; nn<n; nn++) {
			String[] line = (s.nextLine()).split("");
			for(int mm = 0; mm<m; mm++) {
				chess[nn][mm] = line[mm];
			}
		}
	
		// 입력
		
		int change = 32;
		
		for(int nn=0; nn<n-7; nn++) {
			for(int mm=0; mm<m-7; mm++) {
				
				// 모든 8*8 탑색
				
				int current = 0;
				for(int nnn=0; nnn<8; nnn++) {
					for(int mmm=0; mmm<8; mmm++) {
						if((nnn+mmm)%2 == 0) {
							if(!chess[nn+nnn][mm+mmm].equals(chess[nn][mm]))
								current++;
						}
						else {
							if(chess[nn+nnn][mm+mmm].equals(chess[nn][mm]))
								current++;
						}
						
					}
					
				}
				
				if(current>32)
					current = 64-current;
				if(current<change)
					change = current;				
				// 모든 탑색 중 최솟값 찾기
			
			}
		}
		
		System.out.println(change);
		
	}

	
}
