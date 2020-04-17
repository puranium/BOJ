import java.util.Scanner;

public class Fibo3 {
	
	public static int fibo(int n) {
		int a = 0;
		int b = 1;
		int r = 1;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else {
			for(int i = n;i>2;i--) {
				a = b;
				b = r;
				r = a + b;
			}
			return r;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(fibo(n));
	}

}
