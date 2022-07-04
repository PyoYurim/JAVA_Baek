import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] num = br.readLine().split(" ");
		int N = Integer.parseInt(num[0]);
		int X = Integer.parseInt(num[1]);

		String[] A = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			if (X > Integer.parseInt(A[i])) {
				System.out.print(A[i] + " ");
			}
		}
	}
}