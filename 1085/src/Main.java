import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();		
		int y = s.nextInt();		
		int w = s.nextInt();		
		int h = s.nextInt();		
		
		// 주어진 변수 입력
		
		int min = x;
		
		if(min>y) 
			min = y;
		if(min>(w-x)) 
			min = w-x;
		if(min>(h-y)) 
			min = h-y;
		
		// x, y, w-x, h-y를 순서대로 현재까지 최솟값과 비교해 가장 작은것을 찾늗다
		
		System.out.println(min);
		
	}

}
