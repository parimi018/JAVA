class thisk
{
int a;
int b;
void local(int a,int b)
{
this.a=a;
this.b=b;
System.out.print("The value of a and b are:[local]" +this.a+" "+this.b);
}
public static void main(String args[])
{
this t=new this(10,20);
System.out.println("The value of a and b are:[Global]" +a+" "+b);
}
}
