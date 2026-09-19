import java.util.Scanner;
public class Fibo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the fibonacci number you want");
		int n =in.nextInt(); //n is the number of times Fibo going to run
		int p =0;// p is the previous number
		int i = 1;// i is the current number
		int c = 2;// c is the counting
		while(c <=n){
			int temp = i;//storing the current number in temp for future swap
			i=i+p; //add the previous value to i
			p= temp;
			c++;
			
			}
			System.out.println(i);
			
		
		
	}
}