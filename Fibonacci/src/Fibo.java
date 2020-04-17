import java.util.Scanner;

public class Fibo{
	
	public static int fibo(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else if(n == 3)
			return 2;
		else if(n == 4)
			return 3;
		else if(n == 5)
			return 5;
		else {
			return (fibo(n-1) + fibo (n-2));
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(fibo(n));
	}

}
