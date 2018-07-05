import java.util.*;


class  HashSetDemo
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();

		hs.add(new Integer(10));
		hs.add(new Integer(20));
		hs.add(new Integer(30));
		hs.add(new Integer(40));
		hs.add(new Integer(50));

		System.out.println("Data	:	"+hs);

		System.out.println("Retrivng Data Using Iterator");

		Iterator i = hs.iterator();

		while(i.hasNext())
		{
			Object ob = i.next();
			Integer it = (Integer) ob;

			int io = it.intValue();

			System.out.println("Values are	:	"+io);

		}

	}
}
