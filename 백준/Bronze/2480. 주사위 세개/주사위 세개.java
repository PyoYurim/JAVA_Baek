import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] dice = br.readLine().split(" ");
		int A = Integer.parseInt(dice[0]);
		int B = Integer.parseInt(dice[1]);
		int C = Integer.parseInt(dice[2]);
		
		if(A == B && B == C ) {
			System.out.println(10000+A*1000);
		}else if(A == B || A == C) {
			System.out.println(1000+A*100);
		}else if(B == C) {
			System.out.println(1000+B*100);
		}else if(A != B && B != C && A != C) {
			if(A > B) {
				if (A > C) {
					System.out.println(A*100);
				}else {
					System.out.println(C*100);
				}
			}else if (B > A){
				if(B > C) {
					System.out.println(B*100);
				}else {
					System.out.println(C*100);
				}
			}						
		}
	}	
}