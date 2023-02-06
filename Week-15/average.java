class average
{
void mean(int...a)
{
int sum=0;
for(int i:a){
sum=sum+i;
}
System.out.println("No of arguments passed are:"+a.length);
float m=sum/a.length;
System.out.println("The mean of the given numbers is:"+m);
}
public static void main(String args[])
{                                                                                          
average ave=new average();
ave.mean(10,20,30,40,50);
}
}


