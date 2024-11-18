package encapsulation;

public class Bank1 {
	private int pin;

   
    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
   
    public boolean validatePin() {
      
        return pin == 1001 || pin == 1234 || pin == 1212;
    }

    
    public void withdrawAmount(double amount) {
        if (validatePin()) {
            System.out.println("Pin is correct. You have withdrawn: $" + amount);
        } else {
            System.out.println("Invalid Pin. Access Denied.");
        }
    }
}
