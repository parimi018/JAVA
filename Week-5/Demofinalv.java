import java.util.*;
class finalv
{
	final int x=10;
	void print()
	{
		x=20;
		System.out.println("Executed Sucessfully");
	}
}
class DemoFinalv
{
	public static void main(String args[])
	{
		finalv fv=new finalv();
		fv.print();
	}
}