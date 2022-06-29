import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		for(int N = 0; N < T; N++) {
			String[] num = br.readLine().split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);	
			bw.write(String.valueOf((A+B)+"\n"));
		}
		bw.flush();
	}
}