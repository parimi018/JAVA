package p1;
class Demo1
{
	public static void main(String args[])
	{
		access_protection ap=new access_protection();
		derived de=new derived();
		not_derived nde=new not_derived();
		ap.print();
		de.print();
		nde.print();
	}
}
