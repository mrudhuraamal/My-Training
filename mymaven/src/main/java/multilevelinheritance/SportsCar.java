package multilevelinheritance;

public class SportsCar extends Car {
	
	public void sportsCarType(String s) {
        System.out.println("This is a sports car."+name);
        System.out.println("This is a sports car."+number);
        
        System.out.println("This is a sports car."+s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar = new SportsCar();
        sportsCar.type("swift");
        sportsCar.carType(56546);
        sportsCar.sportsCarType("new edition");
	}

}
