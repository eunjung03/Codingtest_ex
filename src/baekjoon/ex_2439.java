package baekjoon;

import java.util.Scanner;

public class ex_2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				System.out.print(" ");
			}
			for(int k=N-i; k<=N; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
}
