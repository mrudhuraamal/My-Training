package inheritance;

public class SalarySlip extends CalcualteHraPf {
	double hra;
	double pf;
	double totalSalary;
	protected double bonus;
	public void pay()
	{
		 hra=hraCal();
	      pf=pfCal();
		 totalSalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("--- Salary Slip ---");
	}
	public void show() {
        System.out.println("Basic Pay:"+basicpay);
        System.out.println("Deduction:"+deduction);
        System.out.println("HRA:"+hra);
        System.out.println("PF:"+pf);
        System.out.println("Bonus:"+bonus);
        System.out.println("Total Salary:" +totalSalary);
		
	}
	

	public static void main(String[] args) 
	{
		SalarySlip slip=new SalarySlip();
		slip.salaryDetails();
		slip.pay();
		slip.show();
	}
}
