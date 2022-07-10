import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int result = A * B * C;
		int index = 0;

		String[] num = Integer.toString(result).split("");

		for (int N = 0; N < 10; N++) {
			index = 0;
			for (int i = 0; i < Integer.toString(result).length(); i++) {
				if (N == Integer.parseInt(num[i])) {
					index++;
				}
			}
			System.out.println(index);
		}
	}
}