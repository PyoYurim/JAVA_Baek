import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			double sum = 0;
			double index = 0;
			double avg = 0;

			String[] num = br.readLine().split(" ");
			for (int j = 1; j < Integer.parseInt(num[0]) + 1; j++) {
				sum += Integer.parseInt(num[j]);
				avg = sum / Integer.parseInt(num[0]);
			}
			for (int j = 1; j < Integer.parseInt(num[0]) + 1; j++) {
				if (Integer.parseInt(num[j]) > avg) {
					index++;
				}
			}
			System.out.printf("%.3f%%\n", index/Integer.parseInt(num[0]) * 100);
		}
	}
}