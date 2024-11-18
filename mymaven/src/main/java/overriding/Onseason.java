package overriding;

public class Onseason extends Clothes {
	public double discount(double price) {
        return price * 0.60;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 1000; 

        
        Clothes objoffseason = new Offseason();
        double offSeasonPrice = objoffseason.discount(price);
        System.out.println("Price after Offseason discount: $" + offSeasonPrice);

       
        Clothes objonseason = new Onseason();
        double onSeasonPrice = objonseason.discount(price);
        System.out.println("Price after Onseason discount: $" + onSeasonPrice);
	}

}
