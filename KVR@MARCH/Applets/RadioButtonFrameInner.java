import Ex1.UDExceptionClassThrows;

class UDExceptionClassHandle 
{


	public static void main(String[] args) 
	{
		UDExceptionClassThrows ob = new UDExceptionClassThrows();
        ob.div(args[0],args[1]);

		catch (ArithmeticException ae)
		{
			System.out.println("");
			System.out.println("ArithmeticException : Enter non zero 4 denominator");
		}
		
		catch (ArrayIndexOutOfBoundsException ao)
		{
			System.out.println("");
			System.out.println("ArrayIndexOutOfBoundsException : Enter 2 valus at CMD_LINE");
		}
	

		catch (NumberFormatException ne)
		{
			System.out.println("");
			System.out.println("NumberFormatException : Enter INT VALUES");
		}
				catch (Exception ao)
		{
			System.out.println("");
			ao.printStackTrace();
		}


		finally
		{
			System.out.println("");
			System.out.println("Finally: Iam always Exicuting HA HA HA ");
		}

	}
}
        �                    H�                                                                                                                    iH�                                    ���                    " ��                                            tH�                                                                                                                                                                                                                                                                                    K��6��                                                                                                        /H�    s��                   