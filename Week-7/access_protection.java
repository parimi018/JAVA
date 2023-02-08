package p1;
public class access_protection
{
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;
	void print()
	{
		System.out.println("This is same class ");
		System.out.println("\tPublic variable is:"+a);
		System.out.println("\tPrivate variable is:"+b);
		System.out.println("\tProtected variable is:"+c);
		System.out.println("\tDefault variable is:"+d);
	}
}
