package aggregation;

public class Address {
   int houseno;
   String street;
   String streetname;
   Student std;
	public Address(int h,String s,String n,Student st)
	{
		houseno=h;
		street=s;
		streetname=n;
		std=st;
	}
	public void show()
	{
		System.out.println("name"+std.name);
		System.out.println("rollnumber"+std.roll);
		System.out.println("housenumber"+houseno);
		System.out.println("strret"+street);
		System.out.println("streetname"+streetname);
	}
}
