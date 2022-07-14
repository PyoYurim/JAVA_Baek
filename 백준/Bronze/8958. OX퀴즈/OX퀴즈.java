import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] num = br.readLine().split("");
			int result = 0;
			int index = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[j].equals("O")) {
					index++;
				} else if (num[j].equals("X")) {
					index = 0;
				}
				result += index;
			}
			System.out.println(result);
		}
	}
}