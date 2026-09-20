import java.util.Scanner;
public class Main {
	public static void NumCount(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = in.nextInt();
		int count = 0;
		System.out.println("enter the number you want to count");
		int a = in.nextInt();
		while(n>0){
			int remainder = n%10;
			n = n/10;
			if(remainder == a){
				count++;
				}
			
			
			}
			System.out.println(count);
			
	}
}