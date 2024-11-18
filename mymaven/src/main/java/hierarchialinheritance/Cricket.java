package hierarchialinheritance;

public class Cricket extends Sport {
	int batnumber;
    public void cricketType(int b) {
    	batnumber=b;
        System.out.println("This is cricket."+name);
        System.out.println("This is cricket number."+batnumber);
    } 

}
