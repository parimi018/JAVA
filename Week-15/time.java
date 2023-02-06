class time
{
int m=0,h=0,s=0;
time()
{
}
time(int sec)
{
m=sec/60;
h=m/60;
m=m%60;
s=sec%60;
}
time(int min , int sec)
{
m=min+(sec/60);
h=m/60;
m=m%60;
s=sec%60;
}
time(int hou,int min,int sec)
{
m=min+(sec/60);
h=hou+(m/60);
m=m%60;
s=sec%60;
}
void display()
{
System.out.println("The time is --> "+h+":"+m+":"+s);
}
public static void main(String args[])
{
time t1=new time();
t1.display();
time t2=new time(3600);
t2.display();
time t3=new time(78,67);
t3.display();
time t4=new time(21,98,78);
t4.display();
}
}


