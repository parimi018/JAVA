import java.util.*;
class typecast
{
int n1;
double n2;
void stol(typecast s)
{
double b=s.n1;
System.out.println("Before type cast="+s.n1);
System.out.println("After type cast="+b);
}
void ltos(typecast s)
{

int a=(int)s.n2;
System.out.println("Before type cast="+s.n2);
System.out.println("After type cast="+a);
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
typecast s=new typecast();
System.out.println("Enter the value of n1:");
s.n1=scan.nextInt();
System.out.println("Enter the value of n2:");
s.n2=scan.nextDouble();
s.stol(s);
s.ltos(s);
}
}