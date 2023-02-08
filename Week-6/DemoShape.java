import java.util.*;
abstract class shape
{
	int l,b;
	abstract void printArea();
	void setparameters(int x,int y)
	{
		this.l=x;
		this.b=y;
	}
}

class rectangle extends shape
{
	void printArea()
	{
		System.out.println("The area of the rectangle is:"+(l*b));
	}
}

class triangle extends shape
{
	void printArea()
	{
		System.out.println("The area of the triangle is:"+(0.5*l*b));
	}
}

class circle extends shape
{
	void printArea()
	{
		System.out.println("The area of the circle is:"+(3.14*l*b));
	}
}

class DemoShape
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.setparameters(10,10);
		r.printArea();
		triangle t=new triangle();
		t.setparameters(10,10);
		t.printArea();
		circle c=new circle();
		c.setparameters(10,10);
		c.printArea();
	}
}
				