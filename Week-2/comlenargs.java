class function
{
public static void main(String args[])
{
int sum=0;
for(String i:args)
{
int num=Integer.parseInt(i);
sum+=num;
}
System.out.println("Sum of given arguments : "+sum);
}
}
