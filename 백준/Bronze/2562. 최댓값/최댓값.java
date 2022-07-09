import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i;
		int[] arr = new int[9];
		int N = 0;

		int max = 0;

		for (i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;

			if (max < arr[i]) {
				max = arr[i];
				N = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(N);
	}
}