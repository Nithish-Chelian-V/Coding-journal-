import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		reverse(n);
		
		
	}
	static int reverse(int n){
		int rem = 0;
		int rev = 0;
		int org = n;
		while(n>0){
			rem = n%10;
			n = n/10;
			rev = rev*10+rem;
			
			}
			System.out.println(rev);
		return rev;
		}
	
	
}