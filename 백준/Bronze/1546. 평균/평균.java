import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int max = 0;
		double sum = 0;

		for (int i = 0; i < N; i++) {
			if (max < Integer.parseInt(num[i])) {
				max = Integer.parseInt(num[i]);
			}
		}
		for (int i = 0; i < N; i++) {
			sum += Double.parseDouble(num[i]) / max * 100;
		}
		System.out.println(sum / N);
	}
}