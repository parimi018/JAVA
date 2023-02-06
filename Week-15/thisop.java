class thisop
{
int a;
int b;
thisop()
{
System.out.println("This is current class constructor");
}
thisop(int a, int b)
{
this();
this.a=a;
this.b=b;
System.out.println(a+" "+b);
}
void m1()
{
System.out.println("THis is 1st method");
}
void m2()
{
System.out.println("This is 2nd method");
this.m1();
}
public static void main(String args[])
{
thisop t=new thisop(4,5);
t.m2();
}

}