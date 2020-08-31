package baekjoon;
import java.io.*;
public class ex_2742 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n<=100000 && n>0) {
			for(int i=n; i>=1; i--) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		
	}

}
