import java.awt.GraphicsEnvironment;

class Fonts 
{
	public static void main(String[] args) 
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String f[] = ge.getAvailableFontFamilyNames();
		System.out.println("");
		System.out.println("No. of fonts are...........");
		for(int i =0;i<f.length;i++)
		{
System.out.println(f[i]);
System.out.println("");
        }
	}
}
