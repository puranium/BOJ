import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		s.nextLine();
		String[] str = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = s.nextLine();
		//	System.out.println(str[i].length()); 
		// 입력확인용	
		}
		// 여기까지 입력
		
		int del = 0; // 중복이라서 지운 개수
		for(int k=1; k<n; k++) {
			for(int i=0; i<k-del; i++) {
				if(compare(str[i], str[k]) == 3){
					for(int m=k; m>i; m--) {
						swap(str, m-1, m);
					}
					break;
				}
				else if(compare(str[i], str[k]) == 2) {
					del++;
					break;
				}
			}
			
		}
		// 정렬
		
		for(int i=0; i<n-del; i++) {
			System.out.println(str[i]);
		}
			
	}
	
	static void swap(String[] arr, int a, int b) {
		String tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		return;
	}
	// a, b 위치바꾸기
		
	static int compare(String a, String b) {
		int ret = 2;
		int al = a.length();
		int bl = b.length();
		char[] arra = a.toCharArray();
		char[] arrb = b.toCharArray();
		
		if(al<bl)
			ret = 1;
		else if(al>bl)
			ret = 3;
		else {
			for(int i=0; i<al; i++) {
				if((int)arra[i]<(int)arrb[i]) {
					ret = 1;
					break;
				}
				else if((int)arra[i]>(int)arrb[i]) {
					ret = 3;
					break;
				}
			}
			
		}
			
		return ret;
	}
		

}
