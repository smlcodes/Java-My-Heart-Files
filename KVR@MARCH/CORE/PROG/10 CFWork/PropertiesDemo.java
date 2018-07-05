import java.util.*;
import java.io.*;


class PropertiesDemo 
{
	public static void main(String[] args)  throws Exception
	{
	Properties  p = new Properties();

	FileInputStream fis = new FileInputStream(args[0]);

	p.load(fis);

	String s1 = p.getProperty("sno");
	String s2 = p.getProperty("sname");
	String s3 = p.getProperty("sadd");
	
		System.out.println("sno	 :	"+s1);
		System.out.println("sno	 :	"+s2);
		System.out.println("sno	 :	"+s3);
	}
}
