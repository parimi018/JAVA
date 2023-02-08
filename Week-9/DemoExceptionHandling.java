class DemoExceptionHandling
{
    public static void main(String args[])
    {
        int n;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try
        {
            System.out.print("Enter size of array: ");
            n = sc.nextInt();
	    int a[]=new int[n];
            System.out.println("The size of the array is: " +n);
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
            System.out.println("Array size cannot be negative");
        }
    }
}