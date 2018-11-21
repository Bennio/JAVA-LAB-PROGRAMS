class EmpDetails
{
	int emp_id;
	String emp_name;
	double basic_salary;
	EmpDetails(int id, String name, double s)
	{
		emp_id = id;
		emp_name = name;
		basic_salary = s;
	}
	
	void Salary()
	{
		double da=basic_salary*40/100; 
		double  hra=basic_salary*20/100; 
		double pf = basic_salary*10/100; 
		double cca = 250; 
		double pt = 100; 
		double it = basic_salary*10/100; 
		double gross_sal=basic_salary+da+hra+cca; 
		double deductions = pt+it+pf; 
		double  netsal = gross_sal - deductions;
		
		System.out.println("Emp id:"+emp_id);
		System.out.println ("Emplyee Name= "+emp_name); 
		System.out.println ("Gross Salary= "+gross_sal);
		System.out.println("Net Salary = "+netsal);

	}
}

public class GrossSal {
	public static void main(String args[])
	{
		EmpDetails e = new EmpDetails(68,"mrinal",100);
		e.Salary();
		
	}

}
