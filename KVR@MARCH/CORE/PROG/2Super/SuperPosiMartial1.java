//1. Whenever we want to call default constructor of base class from derived class using super ()
//in default constructor of derived class is optional.

class Bc
{
	Bc ()
	{
		System.out.println ("I AM FROM BASE CLASS...");
	}
}


class Ibc extends Bc
{
	Ibc ()
	{
	System.out.println ("I AM FROM INter Base CLASS...");
	}
}


class Dc extends Ibc
{
	Dc ()
	{
	super (); //optional
	System.out.println ("I AM FROM DERIVED CLASS...");
	}
};


class SuperPosiMartial1
{
public static void main (String k [])
{
Dc o1=new Dc ();
}
}