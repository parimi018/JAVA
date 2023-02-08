import java.util.*;
final class finalc
{
	void print1()
	{
		System.out.println("This is base class");
	}
}

class A extends finalc
{
	void print2()
	{
		System.out.println("This is derived class");
	}
}

class DemoFinalc
{
	public static void main(String args[])
	{
		A a=new A();
		a.print1();
		a.print2();
	}
}
