import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String inp = s.nextLine();
			
			// split을 이용하기위해 입력을 String으로 받는다
			
			if(inp.equals("0"))
				break;
			else {
				String[] comp = inp.split("");
				
				String ans = "yes";
				for(int i=0; i<(comp.length+1)/2; i++) {
					if(!comp[i].equals(comp[comp.length-1-i])) {
						ans = "no";
						break;
					}	
				}
				
				// 입력받은 숫자를 하나씩 나눠 배열에 저장하고 맨 앞과 맨 끝부터 대칭적으로 비교한다
				
				System.out.println(ans);
					
			}
				
			
			
		}
		
	}

}
