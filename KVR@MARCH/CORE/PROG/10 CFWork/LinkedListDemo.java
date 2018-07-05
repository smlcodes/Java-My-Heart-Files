import java.util.*;

class  LinkedListDemo
{
	public static void main(String[] args) 
	{

//creating linked lst
		LinkedList ll = new LinkedList();

		System.out.println("Data	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("Is Empty	:	"+ll.isEmpty());

	//adding elemets to LiknedList

		ll.add(new Integer(20));
		ll.add(new Integer(30));
		ll.add(new Integer(40));
		ll.add(new Integer(50));

		System.out.println("Data	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("Is Empty	:	"+ll.isEmpty());

		//add elemets at first, and last

		ll.addFirst(10);
		ll.addLast(60);

		System.out.println("Data	:	"+ll);
		System.out.println("Size	:	"+ll.size());

		//retriving 1st, last

		Object l1 = ll.getFirst();
		Integer in1 = (Integer)l1;
		int i1 = in1.intValue();

		System.out.println("First element	:	"+i1);

		Object l2 = ll.getLast();
		Integer in2 = (Integer)l2;
		int i2 = in2.intValue();

		System.out.println("last element	:	"+i2);

//retriving data Using Iterator
		System.out.println("retriving data Using Iterator	:	");

		Iterator it = ll.iterator();	//[................]
		while(it.hasNext())
		{
		Object ob = it.next();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		
		}


//retriving data Using ListIterator in Backword
		System.out.println("retriving data Using ListIterator	Forword :	\n\n\n");

		ListIterator it1 = ll.listIterator();	//[................]

		while(it1.hasNext())
		{
		Object ob = it1.next();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		}
		
		System.out.println("retriving data Using ListIterator	Backword:	n\n\n");
		
		while(it1.hasPrevious())
		{
		Object ob = it1.previous();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		
		}

		System.out.println("retriving data Using toArray():	n\n\n");

		Object ob3[] = ll.toArray();// [		]

		for(int i=0;i<ob3.length;i++)
		{
		Integer io = (Integer) ob3[i];
		int ii = io.intValue();	
		System.out.println("Values are	:	"+ii);
		}


		System.out.println("");
	}
}
