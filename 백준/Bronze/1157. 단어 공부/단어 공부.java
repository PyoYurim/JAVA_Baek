import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String arr = br.readLine();
		int[] num = new int[26];

		for (int i = 0; i < arr.length(); i++) {
			if (arr.charAt(i) >= 97 && arr.charAt(i) <= 122) {
				num[arr.charAt(i) - 97]++;
			} else {
				num[arr.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char qu = '?';
		for(int i = 0; i < 26; i++) {
			if(num[i] > max) {
				max = num[i];
				qu = (char)(i+65);
			}
			else if(num[i] == max) {
				qu = '?';
			}
		}
		System.out.println(qu);
	}
}