package inheritance;

public class CalcualteHraPf extends EmployeeDetails  {
	public double hraCal()
	{
		return basicpay*.05;
	}
	public double pfCal()
	{
		return basicpay*.2;
	}
}
