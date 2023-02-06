class thisk
{
int a=2;
int b=3;
void local(int a,int b)
{
this.a=a;
this.b=b;
System.out.print("The value of a and b are:[local]" +a+" "+b);
}
public static void main(String args[])
{
thisk t=new thisk();
System.out.println("The value of a and b are:[Global]" +t.a+" "+t.b);
t.local(10,20);
}
}
