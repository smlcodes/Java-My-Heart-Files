import java.util.*;


class HashMapDemo 
{
	public static void main(String[] args) 
	{
	HashMap hm = new HashMap(); //[ ]

	System.out.println("Hashmap	:	"+hm);
	System.out.println("size	:	"+hm.size());
	System.out.println("Empty	:	"+hm.isEmpty());

	System.out.println(" ------------------------------------------");

	//put key , value

	hm.put(new Integer(10), new Float(1.5));
	hm.put(new Integer(20), new Float(2.5));
	hm.put(new Integer(30), new Float(3.5));
	hm.put(new Integer(40), new Float(4.5));
	hm.put(new Integer(50), new Float(5.5));


	System.out.println("Hashmap	:	"+hm);
	System.out.println("size	:	"+hm.size());

	System.out.println(" ----------------RETREVING--------------------------");

//retreving all the (key,value) pairs 
	Set s = hm.entrySet();  //{ 10 = 1.5 , 20 = 2.5 ,   30 = 3.5}

	Iterator itr = s.iterator();// pointng to 1st element


	while(itr.hasNext())
	{
				Object  mobj = itr.next(); //retrve 1st pair & place in mobj   [   mobj --> {10 = 2.5}   ]

				//separate kobj , vobj

				Map.Entry me = (Map.Entry) mobj;  //me     --->  {  kobj = 10,  vobj = 1.5  }

				//Rertrive kobj, vobj from 'me'

				Object kobj = me.getKey();
				Object vobj = me.getValue();

				Integer io = (Integer) kobj;
				Float  fo = (Float) vobj;

				int key = io.intValue();
				float  value = fo.floatValue();

				System.out.println("KEY	==	"+key+"       VALUE	  ==	"+value);
				


	
	
	}


	}
}
