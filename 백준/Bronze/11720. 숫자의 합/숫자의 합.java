import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String[] num = br.readLine().split("");
		int result = 0;

		for (int i = 0; i < Integer.parseInt(N); i++) {
			result += Integer.parseInt(num[i]);
		}
		System.out.println(result);
	}
}