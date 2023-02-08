import java.util.*;
class employee
{
	String n,id;
	double s;
	Scanner scan=new Scanner(System.in);
	void getInfo()
	{
		System.out.print("**Enter employee name:");
		n=scan.nextLine();
		System.out.print("  Enter employee id:");
		id=scan.nextLine();
		System.out.print("  Enter employee salary:");
		s=scan.nextDouble();
	}
}

class permanent_employee extends employee
{
	void salary()
	{
		s+=(5*s)/100;
	}
	void print()
	{
		System.out.println("  " +n+"    "+id+"    "+s);
	}
}

class temporary_employee extends employee
{
	void salary()
	{
		s+=(3.5*s)/100;
	}
	void print()
	{
		System.out.println("  "+n+"   "+id+"  "+s);
	}
}

class employeeDemo3
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		permanent_employee pe=new permanent_employee();
		pe.getInfo();
		pe.salary();
		temporary_employee te=new temporary_employee();
		te.getInfo();
		te.salary();
		System.out.println("  Details of the Employee:");
		System.out.println("  Type \t    Name  ID  Total Salary");
		System.out.print("  Permanent");
		pe.print();
		System.out.print("  Temporary");
		te.print();
	}
}
  		
