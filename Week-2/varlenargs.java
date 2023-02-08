class statistics
{
void mean(int... a)
{
int sum=0;
for(int i:a)
{
sum=add(sum,i);
}
System.out.println("Length of arguments :"+(a.length));
float res=sum/(a.length);
System.out.println("The Mean of given arguments : "+res);
} 
int add(int a,int b)
{
return a+b;
}
}
class demo
{
public static void main(String[] args)
{
statistics s=new statistics();
s.mean(10,20,15,30,40);
}
}
