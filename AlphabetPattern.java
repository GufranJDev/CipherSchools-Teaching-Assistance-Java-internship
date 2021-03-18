import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user Input : ");
		int n = sc.nextInt();
		int alpha = 65;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (j <= n - i) {
					System.out.print("  ");
				} else {
					System.out.print((char) (alpha) + " ");
					alpha++;
				}

			}
			System.out.println();
		}
	}
}
