package encapsulation;
import java.util.Scanner;
public class User extends Bank1 {
	
 public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int pass = scanner.nextInt();
        setPin(pass);
        
       
    }
   
	public static void main(String[] args) {
		
		//User user = new User(1234);  
		User user = new User();  
		
        //Bank1 bank = new Bank1();
       // bank.setPin(user.getPin());  

        
        //bank.withdrawAmount(1234, 500);  
        user.withdrawAmount(500);  
	}

}
