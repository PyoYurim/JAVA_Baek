import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num1 = br.readLine();
		String[] num2 = br.readLine().split("");
		
		int A = Integer.parseInt(num1);
		int B = Integer.parseInt(num2[0]);
		int C = Integer.parseInt(num2[1]);
		int D = Integer.parseInt(num2[2]);
		
		int result1 = A*D;
		int result2 = A*C;
		int result3 = A*B;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+(result2*10)+(result3*100));		
	}
}