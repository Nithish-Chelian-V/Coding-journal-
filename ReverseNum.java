import java.util.Scanner;
public class ReverseNum{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to reverse it");
		int num = in.nextInt();
		int rev = 0;
		while(num>0){
			int rem = num%10;
			num = num/10;
			rev = rev* 10 + rem;
			
			
			
			
			}
			System.out.println(rev);
		
		
	}
}