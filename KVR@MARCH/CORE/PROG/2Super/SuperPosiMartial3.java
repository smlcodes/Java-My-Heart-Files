class C1
{
int a;
C1 ()
{
System.out.println ("PARAMETERIZED CONSTRUCTOR - C1");
this.a=a;
System.out.println ("VALUE OF a = "+a);
}
};
class C2 extends C1
{
int b;
C2 (int b)
{
super (); //optional
System.out.println ("PARAMETERIZED CONSTRUCTOR - C2");
this.b=b;
System.out.println ("VALUE OF b = "+b);
}
};

class SuperPosiMartial3
{
public static void main (String k [])
{
C2 o2=new C2 (20);
}
};