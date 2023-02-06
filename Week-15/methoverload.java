class methoverload
{
void methload()
{
System.out.println("Hi");
}
void methload(String s)
{
System.out.println(s);
}
public static void main(String args[])
{
methoverload m=new methoverload();
m.methload();
m.methload("Shreyas");
}
}
