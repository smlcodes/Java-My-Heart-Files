import java.net.InetAddress;


class  InetAddressClass
{
	public static void main(String[] args) throws Exception
	{
		InetAddress i = InetAddress.getByName("LocalHost");

System.out.println("HostName	:	"+i.getHostName());

System.out.println("HostAddress	:	"+i.getHostAddress());

System.out.println("getByName	:	"+i);

//Static InetAddress[]  getAllByName(string)

System.out.println("	getLocalHost:	"+InetAddress.getLocalHost());
	
	}
}
