class bc
{
	bc()
	{
	this(100);
	System.out.println("X");
	}
	bc(int a)
	{
	System.out.println("Y");
	}
}

class idc extends bc
{
	idc()
	{
	super();
	System.out.println("M");
	}
	idc(int a)
	{
		this();
	System.out.println("N");
	}
}

class dc extends idc
{
	dc()
	{
	this(10);
	System.out.println("P");
	}
	dc(int a)
	{
	super(100);
	System.out.println("Q");
	}
}



class ThisSuperAllBest 
{
	public static void main(String[] args) 
	{
		System.out.println("__________________________________________________________________");
		System.out.println("OUTPUT");
		System.out.println("__________________________________________________________________");
		dc ob = new dc();
	}
}

/* _________________________________________________________________
     OUTPUT
	 _________________________________________________________________
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */