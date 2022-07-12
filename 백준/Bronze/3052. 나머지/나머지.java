import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[10];
		int index = 0;
		int[] exam = new int[42];

		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine()) % 42;
		}
		for (int i = 0; i < num.length; i++) {
			exam[num[i]] = 1;
		}
		for (int i = 0; i < exam.length; i++) {
			if (exam[i] == 1) {
				index++;
			}
		}
		System.out.println(index);
	}
}