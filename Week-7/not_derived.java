package p1;
class not_derived
{
	void print()
	{
		access_protection obj=new access_protection();
		System.out.println("This is same package non-child class print() method");
		System.out.println("\tPublic variable is:"+obj.a);
		System.out.println("\tPrivate variable is not accessed here");
		System.out.println("\tProtected variable is:"+obj.c);
		System.out.println("\tDefault variable is:"+obj.d);
	}
}