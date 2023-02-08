import java.util.*;
class employee
{
String name,id,designation;
void reademp()
{
Scanner scan=new Scanner(System.in);
System.out.print("\tEnter employee name:");
name=scan.nextLine();
System.out.print("\tEnter employee id:");
id=scan.nextLine();
System.out.print("\tEnter employee designation:");
designation=scan.nextLine();
}
}
class salary extends employee
{
double BP,HRA,DA,PF,np;
void readsalary()
{
Scanner scan=new Scanner(System.in);
System.out.print("\tEnter employee basic pay:");
BP=scan.nextDouble(); 
System.out.print("\tEnter HRA:");
HRA=scan.nextDouble();
System.out.print("\tEnter DA:");
DA=scan.nextDouble();
System.out.print("\tEnter PF:");
PF=scan.nextDouble();
}
void calculatesalary()
{
np=BP+HRA+DA-PF;
}
void displayemp()
{
System.out.println("\tNet pay of the employee is:"+np);
}
}
class employeeDemo2
{
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
System.out.print("Enter no of employees:");
n=scan.nextInt();
salary e[]=new salary[n];
for(int i=0;i<n;i++)
{
e[i]=new salary();
System.out.println("Enter "+(i+1)+" th employee details:");
e[i].reademp();
e[i].readsalary();
e[i].calculatesalary();
e[i].displayemp();
}
}
}
