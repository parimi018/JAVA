import java.util.*;
class Employee
{
String n,id;
int s,w;
void getInfo()
{
Scanner scan=new Scanner(System.in);
System.out.print("\tEnter name:");
n=scan.nextLine();
System.out.print("\tEnter the id:");
id=scan.nextLine();
System.out.print("\tEnter the salary:$");
s=scan.nextInt();
System.out.print("\tEnter the hours of work per week:");
w=scan.nextInt();
}

void Addsal()
{
if(s<500){
s=s+10;
}
}

void Addwork()
{
if(w>6){
s=s+5;
}
}

void display()
{
System.out.println("\tFinal salary is:$"+s);
}
}

class EmployeeDemo
{
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
System.out.println("Enter no of employees:");
n=scan.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
e[i]=new Employee();
System.out.println();
System.out.println("Enter "+(i+1)+" employee details:");
e[i].getInfo();
e[i].Addsal();
e[i].Addwork();
e[i].display();
}
}
}
