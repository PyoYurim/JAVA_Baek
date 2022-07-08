import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int min = 1000000;
		int max = -1000000;

		for (int i = 0; i < N; i++) {
			if (min > Integer.parseInt(num[i])) {
				min = Integer.parseInt(num[i]);
			}
			if (max < Integer.parseInt(num[i])) {
				max = Integer.parseInt(num[i]);
			}
		}
		System.out.print(min + " " + max);
	}
}