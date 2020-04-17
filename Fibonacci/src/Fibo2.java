import java.util.Scanner;

public class Fibo2 {
	
	public static int fibo(int n) {
		switch(n) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 1;
		case 3:
			return 2;
		case 4:
			return 3;
		case 5:
			return 5;
		case 6:
			return 8;
		case 7:
			return 13;
		case 8:
			return 21;
		case 9:
			return 34;
		case 10:
			return 55;
		default:
			return (fibo(n-1) + fibo(n-2));
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fibo(n));		
	}

}
