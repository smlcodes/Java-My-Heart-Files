import java.io.*;
import ser.SerializeSubClass;
import java.util.*;

public class SerializationProcess 
{
	public static void main(String[] args)  throws Exception
	{
		SerializeSubClass ob = new SerializeSubClass();

		Scanner sc = new Scanner(System.in);
		System.out.println(" sno	:");
		String sno = sc.next();

		System.out.println(" sname	:");
		String sname = sc.next();

		System.out.println(" marks	:");
		String marks = sc.next();

		int sn = Integer.parseInt(sno);
		float mar = Float.parseFloat(marks);

		ob.setSno(sn);
		ob.setSname(sname);
		ob.setMarks(mar);

		//write data to a file
		System.out.println(" File Name	:");
		String file = sc.next();

		FileOutputStream fos = new  FileOutputStream(file);

		ObjectOutputStream obj = new 		ObjectOutputStream(fos);

		obj.writeObject(ob);



		System.out.println("Hello World!");
	}
}
