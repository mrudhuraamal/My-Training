package superkeyword;
import java.util.Scanner;
public class AdditionResult extends Addition {
	 public void isDivisibleBy10(int a, int b) {
	        
	        int result = super.sum(a, b);
	        System.out.println("Addition result: " + result);

	        if (result % 10 == 0) {
	            System.out.println("The result is divisible by 10.");
	        } else {
	            System.out.println("The result is not divisible by 10.");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		AdditionResult obj = new AdditionResult();
	       System.out.println("enter first number");
	        int num1 = sc.nextInt();
	        System.out.println("enter second number");
	        int num2 = sc.nextInt();
          obj.isDivisibleBy10(num1, num2); 
	}

}
