import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] time = br.readLine().split(" ");
		int A = Integer.parseInt(time[0]);
		int B = Integer.parseInt(time[1]);
		int C = Integer.parseInt(br.readLine());
		
		if(B+C >= 60) {
			if(A+(B+C)/60 >= 24) {
				System.out.println(A+(B+C)/60-24 + " " + (B+C)%60);
			}else {
				System.out.println(A+((B+C)/60) + " " + (B+C)%60);
			}
		}else {
			System.out.println(A+((B+C)/60) + " " + (B+C));
		}
	}	
}