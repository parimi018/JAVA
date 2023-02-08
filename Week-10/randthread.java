
import java.util.Random;
class eventhread extends Thread
{
int num;
eventhread(int value)
{
num=value;
start();
}
public void run()
{
try{
System.out.print("Square - "+num*num);
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("Error occured.");
}
}
}
class oddthread extends Thread
{
int num;
oddthread(int value)
{
num=value;
start();
}
public void run()
{
try{
System.out.print("Cube - "+num*num*num);
Thread.sleep(1000);
}
catch (InterruptedException e){
System.out.println("Error occured.");
}
}
}
class randomthread extends Thread
{
int num;
randomthread()
{
start();
}
public void run()
{
try{
Random random= new Random();
num=random.nextInt(100);
System.out.println("Number :"+num);
if(num%2==0){ eventhread t=new eventhread(num);}
if(num%2!=0){ oddthread t=new oddthread(num);}
Thread.sleep(1000);
}
catch (InterruptedException e){
System.out.println("Error occured.");
}
}
}
class Test
{
public static void main(String[] args)
{
randomthread r=new randomthread();
shThread.sleep(1000);
}
catch (InterruptedException e){
System.out.println("Error occured.");
}
}
}
