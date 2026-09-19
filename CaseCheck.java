import java.util.Scanner;
public class CaseCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a single character to find its Case");
		char ch = in.next().trim().charAt(0); // This line used to take a single character and trim its space and store it
		if(ch>='a' && ch<='z'){
			System.out.println("The given input is a lower case");
			
			}else{
				System.out.println("The given input is a  upper case");
				}
		
		
	}
}