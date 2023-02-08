import java.util.*;
interface students
{
	void getvalue();
}

interface department
{
	void getattendense();
}

class Exam implements students,department
{
	Scanner scan=new Scanner(System.in);
	String sname,sno;
	int sclass;
	double fiatt=0;
	double att[]=new double[6]; 
	public void getvalue()
	{
		System.out.print("Enter student serial number:");
		sno=scan.nextLine();
		System.out.print("Enter student name:");
		sname=scan.nextLine();
		System.out.print("Enter student class:");
		sclass=scan.nextInt();
	}
	public void getattendense()
	{
		System.out.println("Enter the student attendence of past 6 months");
		for(int i=0;i<6;i++)
		{	
			System.out.print("\tMonth"+(i+1)+":");
			att[i]=scan.nextDouble();
		}
	}
	void calattendense()
	{
		for(double i:att)
			fiatt+=i;
		fiatt/=6;
	}
	boolean eligible()
	{
		return fiatt>75;
	}
	void printeligible()
	{
		if(eligible())
		{
			System.out.println("Student serial number:"+sno);
			System.out.println("Student name:"+sname);
			System.out.println("Student class:"+sclass);
			System.out.println("Student is eligible to write exams:");
		}
		else
		{
			System.out.println("Student serial number:"+sno);
			System.out.println("Student name:"+sname);
			System.out.println("Student class:"+sclass);
			System.out.println("Student is not eligible to write exams:");
		}
	}
}

class DemoExam
{
	public static void main(String args[])
	{
		Exam e=new Exam();
		e.getvalue();
		e.getattendense();
		e.calattendense();
		e.printeligible();
	}
}

	
		
		