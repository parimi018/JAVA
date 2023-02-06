import java.util.*;
class swap
{
int a,b;
void callbyval(int a, int b)
{
int temp=a;
a=b;
b=temp;
}
void callbyref(swap s)
{
int temp=s.a;
s.a=s.b;
s.b=temp;
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
swap s=new swap();
System.out.println("Enter the values of a and b:");
s.a=sc.nextInt();
s.b=sc.nextInt();
System.out.println("The values of a and b before swapping are:"+s.a+"and"+s.b+"respectively");
s.callbyval(s.a,s.b);
System.out.println("The values of a and b after call by value are:"+s.a+"and"+s.b);
s.callbyref(s);
System.out.println("The values of a and b after call by reference are:"+s.a+""+s.b);
}
}
