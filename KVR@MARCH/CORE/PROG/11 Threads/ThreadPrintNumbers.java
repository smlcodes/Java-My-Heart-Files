//print  1 to10 num with 1sec of gap

class Thread1 extends Thread 
{
	public void run() 
	{
		try
		{
		for(int i=1;i<=10;i++)
		{
		Thread.sleep(1000);
		System.out.println("Count	:	"+i);
		}//for
		}//try
			catch (InterruptedException ie)
			{
					ie.getMessage();
			}
	}//method
}//class


class  ThreadPrintNumbers
{
	public static void main(String[] args) 
	{

		Thread1 t1 = new Thread1();
		ThreadGroup th = t1.getThreadGroup();	
		System.out.println("Is alive	"+t1.isAlive());

			t1.start();
			try
			{
			Thread.sleep(5000);
			System.out.println("Is alive	"+t1.isAlive());

			Thread.sleep(6004);
			System.out.println("Is alive	"+t1.isAlive());
		
			}
			catch (Exception e)
			{
			}
		

		System.out.println("ThreadGroup	:	"+th);//------> here 
	}
}
