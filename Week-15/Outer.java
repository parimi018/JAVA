class Outer
{
int outer_x=2;
void test()
{
Inner i=new Inner();
outer_x+=2;
i.display();
}
class Inner
{
void display()
{
System.out.println("Outer_x="+outer_x);
}
}
}
class InnerclassDemo
{
public static void main(String args[])
{
Outer o=new Outer();
o.test();
}
}
