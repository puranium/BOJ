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
		for(int k=n-1; k>0; k--) {
			for(int i=0; i<k; i++) {
				compare(str,i,i+1);
			}
			
		}
		
		int del = 0;
		for(int i=0; i<n-1; i++) {
			if(same(str[i-del], str[i+1-del])) {
				for(int j=i-del; j<n-1-del; j++) {
					str[j] = str[j+1];
				}
				del++;
			}
			
		}
		// 중복된 원소 지우고 배열 앞으로 밀기
		
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
		
	static void compare(String[] arr, int c, int d) {
		int cl = arr[c].length();
		int dl = arr[d].length();
		if(cl>dl)
			swap(arr,c,d);
		else if(cl == dl) {
			char[] arrc = arr[c].toCharArray();
			char[] arrd = arr[d].toCharArray();
			for(int i=0; i<cl; i++) {
				if((int)arrc[i]>(int)arrd[i]) {
					swap(arr,c,d);
					break;
				}
				else if((int)arrc[i]<(int)arrd[i])
					break;
					
			}
			
		}
	
	}
	// c, d의 크기비교후 swap
	
	static boolean same(String a, String b) {
		char[] arra = a.toCharArray();
		char[] arrb = b.toCharArray();
		
		boolean ret = true;
		
		if(a.length() != b.length())
			ret = false;
		else{
			for(int i=0; i<a.length(); i++) {
				if(arra[i] != arrb[i]) {
					ret = false;
					break;
				}
				
			}
		}
		
		return ret;
		
	}

}
