package interfaceexample;

public class HDFC implements RBI  {
	public double recurringDeposit(double amount, int duration) {
       double maturityAmount = amount * (1 + (INTEREST_RATE * duration / 100));
        return maturityAmount;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
       double amount = 10000; 
        int duration = 3;
       double maturityAmount = hdfc.recurringDeposit(amount, duration);
   System.out.println("The maturity amount after " + duration + " years is: " + maturityAmount);
	}
}
