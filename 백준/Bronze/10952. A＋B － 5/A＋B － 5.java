import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] num = br.readLine().split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);

			if (A == 0 && B == 0) {
				return;
			} else {
				System.out.println(A + B);
			}
		}
	}
}