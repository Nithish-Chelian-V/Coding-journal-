import java.util.Scanner;
public class Armstrongnumberprint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
       for(int i =100;i<1000;i++){
       if(isarmstrong(i)){
       	System.out.println(i);
       	}	
       	}
       	
	}
	
	
	
 static boolean isarmstrong(int n) {
		int org = n;
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem * rem * rem;
			

		}
		return sum == org;
	}
}