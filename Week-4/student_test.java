import java.util.*;
class student
{
	String sn,rn;
	void getinfo()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\t*Enter Student name:");
		 sn= scan.nextLine();
		System.out.print("\t Enter Student roll no:");
		 rn = scan.nextLine();
	}
}

class test extends student
{
	int mar[]=new int[6];
	void getmarks()
	{
		System.out.print("\t Enter 6 subject marks:");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			mar[i]=scan.nextInt();
		}
		
	}
}

class result extends test
{
	void totalmarks()
	{
		int m=0;
		for(int i=0;i<6;i++)
		{
			m+=mar[i];
		}
		System.out.println("\t The total marks obtained by "+sn+" is "+m);
	}
}

class studentDemo
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter no of students:");
		int n=scan.nextInt();
		result r[]=new result[n];
		for(int i=0;i<n;i++)
		{
			r[i]=new result();
			r[i].getinfo();
			r[i].getmarks();
			r[i].totalmarks();
		}
	}
}
