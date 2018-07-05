
class Test
{
	int a, b;
		
		
		Test ()
		{
				this (10); //calling current class single parameterized constructor
				System.out.println ("I AM FROM DEFAULT CONSTRUCTOR...");
				a=1;
				b=2;
				System.out.println ("VALUE OF a = "+a);
				System.out.println ("VALUE OF b = "+b);
		}


Test (int x)
{
	 this (100, 200); //calling current class double parameterized constructor
	System.out.println ("I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...");
	a=b=x;
	System.out.println ("VALUE OF a = "+a);
	System.out.println ("VALUE OF b = "+b);
}


Test (int a, int b)// here the Formal Perameters are same as dataMemmbers
{
	System.out.println ("I AM FROM 2 paramertzed CONSTRUCTOR...");
	a=a;		// Here JVM is confused, so it give More preferenece to LocalVariables
	b=b;
	System.out.println ("VALUE OF a = "+this.a); //0
	System.out.println ("VALUE OF b = "+this.b);//0
	System.out.println ("VALUE OF a = "+a);//100
	System.out.println ("VALUE OF b = "+b);//200
}


}


class ThisDemo
{
	public static void main (String k [])
		{
			Test t1=new Test ();
		}
}

/*

I AM FROM 2 paramertzed CONSTRUCTOR...
VALUE OF a = 0
VALUE OF b = 0
VALUE OF a = 100
VALUE OF b = 200
I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...
VALUE OF a = 10
VALUE OF b = 10
I AM FROM DEFAULT CONSTRUCTOR...
VALUE OF a = 1
VALUE OF b = 2

*/