import java.util.*;
class finalm
{
	final void print()
	{
		System.out.println("Executed");
	}
}
class A extends finalm
{
	void print()
	{
		System.out.println("Method overriding sucessfull");
	}
}

class DemoFinalm
{
	public static void main(String args[])
	{
		A a=new A();
		a.print();
	}
}
		