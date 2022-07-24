import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < str[1].length(); j++) {
				String[] test = str[1].split("");
				for (int t = 0; t < Integer.parseInt(str[0]); t++) {
					System.out.print(test[j]);
				}
			}
			System.out.println();
		}
	}
}