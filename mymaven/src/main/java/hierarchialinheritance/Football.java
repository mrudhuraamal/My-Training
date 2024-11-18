package hierarchialinheritance;

public class Football extends Sport {
	int footballnumber;
    public void footballType(int a) {
    	footballnumber=a;
        System.out.println("This is football."+name);
        System.out.println("This is football number."+footballnumber);
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cricket cricket = new Cricket();
	        cricket.type("ipl");
	        cricket.cricketType(987);

	        Football football = new Football();
	        football.type("iipl");
	        football.footballType(878);
	}

}
