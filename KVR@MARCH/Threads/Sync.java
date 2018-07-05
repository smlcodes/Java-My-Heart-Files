//Account class
//Cost Class         ----------> thread
//Sync class			----------> main


class Account
{

	private int bal = 0;

	synchronized void deposit(int amt)
	{
			bal =  bal + amt;

			System.out.println("Current Bal is : "+bal);
	}

	 int getBal()
	{
	
	return bal;
	
	}

}//Account


class Cust extends Thread 
{
	Account ac ;

	Cust(Account ac)
	{
	this.ac = ac;
	}

	public void run()
	{
	ac.deposit(10);
	}

}//cust



class Sync 
{
	public static void main(String[] args) 
	{
		Account ac = new Account();

		Cust cu[] = new Cust[5];

		for(int i=0;i<5;i++)
		{
				cu[i] = new Cust(ac);
		}


		for(int i=0;i<5;i++)
		{
				cu[i].start();
		}


try
{
	
	for(int i=0;i<5;i++)
		{
				cu[i].join();
		}

}
	catch (InterruptedException e)
	{
		System.err.println("Error in Thred Ecxe......");
	}

		System.err.println("Final Balance	:"+ac.getBal());
	}
}//Sync
