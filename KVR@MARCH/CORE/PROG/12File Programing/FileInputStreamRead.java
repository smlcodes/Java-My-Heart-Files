import java.io.*;

class FileInputStreamRead
{
	public static void main(String[] args)  throws Exception
	{

		//choose file
		String fname = args[0];

		//open in read mode
		FileInputStream fos = new FileInputStream(fname);
		//read Operations
		while( (fos.read() )!= -1)
		{
		System.out.println("i	value	:"+fos.read());

		}
		
	}
}
