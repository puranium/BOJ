import java.util.Scanner;
import java.util.ArrayList;
public class Bridge {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m, n;
		
		while(true){
			m = s.nextInt();
			n = s.nextInt();
			if(m == 0 && n == 0)
				break;
			else {
				int[] player = new int[10000];
				for(int i = 0; i<10000; i++)
					player[i] = 0;
			
				int k;
				for(int i = 0; i<m*n; i++) {
					k = s.nextInt();
					player[k-1] = player[k-1] + 1;		
				}
				int a = 1;
				int b = 0;
				for(int i = 0; i<10000; i++) {
					if(player[i]>a) {
						b = a;
						a = player[i];
					}
					else if(a>player[i] && player[i]>b)
						b = player[i];
				}
				for(int i = 0; i<10000; i++) {
					if(player[i] == b)
						System.out.print(i+1 + " ");
					}
				System.out.println();
			}		
		}
	}
}
