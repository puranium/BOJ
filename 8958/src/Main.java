import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int test_case = s.nextInt();
		s.nextLine();
		
		for(int i=0; i<test_case; i++) {
			int score = 0;
			int conti = 0;
			// score : 더해진 점수, conti : 현재점수 = 연속된개수
			
			String ox = s.nextLine();
			String[] ans = ox.split("");
			// ox 한줄을 입력받아 나누어담는다
			
			for(int j=0; j<ox.length(); j++) {
				if(ans[j].equals("O")) {
					conti++;
					score = score + conti;
				}
				else {
					conti = 0;
				}
			}
			
			System.out.println(score);
			
		}
		
		
	}

}
