//print  1 to10 num with 1sec of gap

class Thdemo extends Thread
{

	public void run() 
	{
		try
		{
			for(int i = 0; i<= 10 ; i++)
			{
			System.out.println("i	:"+i);

			Thread.sleep(1000);
			
			}

		}
		
		catch (InterruptedException e)
		{
			System.out.println("Error Boss");
		}
	
	
	}
}



class ThDemo2 
{
	public static void main(String[] args) 
	{
			Thdemo t1 = new Thdemo();
			System.out.println("Excecution Status of  Thread	Before Start	:	" +t1.isAlive());
			t1.start();

			System.out.println("Excecution Status of  Thread	After  Start	:	" +t1.isAlive());

			try
			{
				Thread.sleep(5000);
				System.out.println("Excecution Status of  Thread	Middile	:	" +t1.isAlive());

				Thread.sleep(5001);
				System.out.println("Excecution Status of  Thread	final	:	" +t1.isAlive());
			}
			catch (InterruptedException e)
			{
			System.out.println("see");
			}
	}
}
