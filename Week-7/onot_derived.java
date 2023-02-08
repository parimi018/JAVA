package p2;
import p1.access_protection;
class onot_derived
{
	access_protection obj2=new access_protection();
	void print()
	{
		System.out.println("This is other package not derived class ");
		System.out.println("\tPublic variable is:"+obj2.a);
		System.out.println("\tPrivate variable is not accessed here");
		System.out.println("\tProtected variable is not accessed here");
		System.out.println("\tDefault variable is not accessed here");
	}
}