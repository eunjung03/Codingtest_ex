package baekjoon;

import java.util.Scanner;

public class ex_1330 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=(-10000)&&b<=10000) {
			if(a>b) {
				System.out.println(">");
			}else if(a<b) {
				System.out.println("<");
			}else {
				System.out.println("==");
			}
		}
	}

}
