import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user Input : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}