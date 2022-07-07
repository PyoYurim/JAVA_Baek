import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int org = N;
		int G = 0;
		while (true) {
			int i = org / 10;
			int j = org % 10;
			
            int fir = i + j;
			org = j * 10 + fir % 10;
			
            G++;
			if (org == N) {
				System.out.println(G);
				break;
			}
		}
	}
}