import java.util.*;
class methoload
{
	void area()
	{
		int l=10;
		int b=20;
		System.out.println("The area of the room is:"+(l*b));
	}
	void area(int l)
	{
		int b=20;
		System.out.println("The area of the room is:"+(l*b));
	}
	void area(int l,int b)
	{
		System.out.println("The area of the room is:"+(l*b));
	}
}

class Demomethoload
{
	public static void main(String args[])
	{
		methoload ml=new methoload();
		ml.area();
		ml.area(10);
		ml.area(10,20);
	}
}