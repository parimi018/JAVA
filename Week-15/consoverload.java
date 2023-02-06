class consoverload
{
consoverload()
{
System.out.println("Hi");
}
consoverload(String s)
{
System.out.println("My name is "+s);
}
consoverload(int a)
{
System.out.println("My age is "+a);
}
consoverload(String s, int a)
{
System.out.println("My name is "+s+" and i am "+a+" years old.");
}
public static void main(String args[])
{
consoverload c1=new consoverload();
consoverload c2=new consoverload("Shreyas");
consoverload c3=new consoverload(18);
consoverload c4=new consoverload("Shreyas",18);
}
}