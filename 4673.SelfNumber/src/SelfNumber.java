import java.util.ArrayList;
public class SelfNumber {
	
	public static int d(int n) {
		int res = n + n/10000 + (n%10000)/1000 + (n%1000)/100 + (n%100)/10 + n%10;
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i<10001; i++)
			list.add(i);
		while(list.size() > 0) {
			int a = list.get(0);
			System.out.println(a);
			do {
				list.remove((Integer)a);
				a = d(a);
			}
			while(a<10001);
		}
	}
}
