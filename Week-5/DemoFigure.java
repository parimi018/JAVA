import java.util.*;
class Figure
{
	int l=10,b=20;
	void area()
	{
		System.out.println("This method computes the area of an object");
	}
}

class rectangle extends Figure
{
	void area()
	{
		System.out.println("The area of the rectangle is:"+(l*b));
	}
}

class triangle extends Figure
{
	int h=30;
	void area()
	{
		System.out.println("The area of the triangle is:"+(0.5*l*h));
	}
}

class DemoFigure
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.area();
		triangle t=new triangle();
		t.area();
	}
}
	