package Mar4;

//기본수학2
/*
- 소수 1929
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class math_1929_timeError {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i=m; i<n+1; i++) {
			if(check(i)==true)
				System.out.println(i);
		}
	}
	
	 public static boolean check(int a){
		boolean b = true;
		for (int i=2; i<a ; i++) {
			if(a%i==0) {
				b=false;
				break;
			}
		}
	    return b;
	 }
	
}
