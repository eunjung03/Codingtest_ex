package baekjoon;

import java.util.Scanner;

public class ex_2739 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>=1 && N<=9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",N,i,N*i);
			}
		}
	}

}
