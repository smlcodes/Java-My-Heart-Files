class Length
{
		public static void main(String[] args) 
	{
			int a[ ] = {1,2,3,4,5};
			System.out.println("Length		"+a.length);
		
			System.out.println("a[0]	:	"+a[0]);
			System.out.println("a[1]	:	"+a[1]);

			System.out.println("Sum	:	"+a[0]+a[1]);// String Formate

			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			int sum = x+y;

			System.out.println("Sum	:	"+sum);// Converted

	}
}
