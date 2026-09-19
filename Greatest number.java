import java.util.Scanner;
public class Great {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      	int a = in.nextInt();
      	int b = in.nextInt();
      	int c = in.nextInt();
      	if(a>b && a> c ){
      	   System.out.println("A is the greatest number");
      	   }
      	else if(b>a && b>c){
      		System.out.println("b is the greatest number");
      	}
      	else{
      		System.out.print("c is the greatest number");
      	}
  
  
	

	}
}