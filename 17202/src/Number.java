import java.util.Arrays;
import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num1 = s.nextLine();
		String num2 = s.nextLine();
		
		//System.out.println(num1);
		//System.out.println(num1.charAt(0));
		
		//int ex = Character.getNumericValue(num1.charAt(0));
		//System.out.println(ex);
		
		int[] arr = new int[16];
		for(int i=0; i<8; i++) {
			int num = Character.getNumericValue(num1.charAt(i));
			arr[2*i] = num;
		}
		for(int i=0; i<8; i++) {
			int num = Character.getNumericValue(num2.charAt(i));
			arr[2*i+1] = num;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		for(int j=15; j>1; j--) {
			for(int i=0; i<j; i++) {
				arr[i] = (arr[i]+arr[i+1])%10;
			}
		}
		System.out.println(arr[0] + "" + arr[1]);
	}

}

