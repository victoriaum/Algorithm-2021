package Mar24;

import java.util.*;

public class for_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i=1; i<n; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*n-2*i-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
