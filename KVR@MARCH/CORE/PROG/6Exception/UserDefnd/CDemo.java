

import neg.NvalException;
import pos.PvalException;
import org.satya.Emp;


class CDemo
{
	public static void main(String[] args)
	{
		try
		{
			String s1=args [0];
			Emp e = new Emp();
			e.diposit(s1);
		}

catch (NvalException ne)
{
System.out.println (ne);
}

catch (PvalException pe)
{
System.out.println (pe);
}

catch (ArithmeticException ae)
{
System.out.println ("PASS INTEGER VALUES ONLY..!");
}

catch (ArrayIndexOutOfBoundsException aioobe)
{
System.out.println ("PASS VALUES THROUGH COMMAND PROMPT..!");
}

}

}