package baekjoon;
import java.io.*;
import java.util.*;
public class ex_11021 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A+B;
			
			bw.write("Case #"+i+": "+sum+"\n");
		}
		bw.flush();
	}

}
