import java.util.Scanner;
public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		isarmstrong(n);

	}
	static boolean isarmstrong(int n) {
		int orginal = n;
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem * rem * rem;
			if (sum == orginal) {
				System.out.println("given number is a armstrong number");
				return true;

			}

		}
		return false;
	}
}