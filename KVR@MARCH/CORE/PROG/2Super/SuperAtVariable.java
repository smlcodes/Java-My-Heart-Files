class Bc
{
	int a;
}

class Dc extends Bc
{

	int a,b;

	void set(int x, int y)
	{
	super.a=x;
	this.a=y;
	}

	void sum()
	{
		b = super.a+a;
	System.out.println("Sum.,,,,,,,,"+b);
	}

	void disp()
	{
	System.out.println("super.a	:	"+super.a);
	System.out.println("this.a	:	"+this.a);
	}

}


class SuperAtVariable
{

	public static void main(String args[])
	{
	
	System.out.println("Started...................");



	Dc d = new Dc();
		d.set(10,20);
		d.sum();
		d.disp();
		

	}
}