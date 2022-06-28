import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N  = Integer.parseInt(br.readLine());
		
		for (int C = 0; C < N; C++) {
			String[] num = br.readLine().split(" ");
			
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);	
			
			System.out.println(A+B);
		}
	}
}