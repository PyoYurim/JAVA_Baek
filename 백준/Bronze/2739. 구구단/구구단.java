import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

			for (int M = 1; M < 10; M++) {
				System.out.println(N + " * " + M + " = " + N * M);
		}
	}
}