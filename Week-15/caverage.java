class caverage
{
public static void main(String args[])
{
int s=0;
for(String i:args)
{
int n=Integer.parseInt(i);
s=s+n;
}
float m=s/args.length;
System.out.println("Their mean is: "+m);
}
}

