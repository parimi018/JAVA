class staticop
{
static int a=4;
static int b;
static void samp(int x)
{
System.out.println("x="+x);
System.out.println("b="+b);
}
static
{
System.out.println("Static block is initiated");
b=a*4;
}
public static void main(String args[])
{
System.out.println("a="+a);
samp(20);
}
}




