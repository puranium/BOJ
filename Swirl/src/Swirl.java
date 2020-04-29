import java.util.Scanner;
public class Swirl {
	
	static int x = 0;
	static int y = 0;
	static int a = 0;
	static int b = 0;
	
	public static void r() {
		x = a;
		y = b;
		a = a+1;
	}
	public static void l() {
		x = a;
		y = b;
		a = a-1;
	}
	public static void u() {
		x = a;
		y = b;
		b = b-1;
	}
	public static void d() {
		x = a;
		y = b;
		b = b+1;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] box = new int[n][n];
		
		for(int i=n*n; i>0; i--) {
			box[a][b] = i;
			if(a == 0 && b == 0) 
				r(); 
			else if(x<a) {
				if(a == n-1)
					d();
				else if(box[a+1][b] == 0)
					r();
				else
					d();
			}
			else if(y<b) {
				if(b == n-1)
					l();
				else if(box[a][b+1] == 0)
					d();
				else
					l();
			}
			else if(x>a) {
				if(a == 0)
					u();
				else if(box[a-1][b] == 0)
					l();
				else
					u();
			}
			else if(y>b) {
				if(box[a][b-1] == 0)
					u();
				else
					r();
			}
		}
	
			
		
		/*
		for(int i=n*n; i>0; i--) {
			box[a][b] = i;
			if(b == 0) {
				if(a == n-1)
					b = b+1;
				else
					a = a+1;
			}
			else if(a == n-1) {
				if(b == n-1)
					a = a-1;
				else
					b = b+1;
			}
			else if(b == n-1) {
				if(a == 0)
					b = b-1;
				else
					a = a-1;
			}
			else if(a == 0) {
				if(b == 1)
					a = a+1;
				else
					b = b-1;
			}
			else if(box[a-1][b] != 0 && box[a][b-1] != 0)
				a = a+1;
			else if(box[a+1][b] != 0 && box[a][b-1] != 0)
				b = b+1;
			else if(box[a+1][b] != 0 && box[a][b+1] != 0)
				a = a-1;
			else
				b = b-1;
		}
		*/
		
		for(int j = 0; j<n; j++) {
			for(int i = 0; i<n; i++) {
				System.out.print(box[i][j]);
			}
			System.out.println();
		}			
		
	}

}
