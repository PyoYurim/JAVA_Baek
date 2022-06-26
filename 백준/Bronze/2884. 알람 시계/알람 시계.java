import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] time = br.readLine().split(" ");
		int H = Integer.parseInt(time[0]);
		int M = Integer.parseInt(time[1]);
		
		if(H > 0) {
			if (M >= 45) {
				System.out.printf("%d %d", H,M-45);
			} else {
				System.out.printf("%d %d", H-1, M+60-45);
			}
		}else {
			if(M >= 45) {
				System.out.printf("%d %d",H,M-45);
			}else {
				System.out.printf("%d %d",23,M+60-45);
			}
		}	
	}
}