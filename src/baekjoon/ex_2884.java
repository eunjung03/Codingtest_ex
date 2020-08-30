package baekjoon;

import java.util.Scanner;

public class ex_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if((H>=0 && H<=23) && (M>=0 && M<=59)) {
			if(M<45) {
				if(H==0) {
					System.out.printf("%d %d",H-1+24,M+60-45);
				}else {
					System.out.printf("%d %d",H-1,M+60-45);
				}
			}else {
				System.out.printf("%d %d",H,M-45);
			}
		}
	}

}
