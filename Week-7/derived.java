package p1;
class derived extends access_protection
{
	void print()
	{
		System.out.println("This is same package derived class ");
		System.out.println("\tPublic variable is:"+a);
		System.out.println("\tPrivate variable is not accessed here");
		System.out.println("\tProtected variable is:"+c);
		System.out.println("\tDefault variable is:"+d);
	}
}