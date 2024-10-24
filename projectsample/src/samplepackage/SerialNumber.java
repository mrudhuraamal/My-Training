package samplepackage;

public class SerialNumber {
	public void number(int n)
	{
		int i=0;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerialNumber value=new SerialNumber();
		System.out.println("sample program");
		value.number(10);
		System.out.println("end");
	}

}
