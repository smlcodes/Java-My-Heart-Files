package stage2;

import stage1.Validate;
import stage1.InValidate;

public class  ValidateLogic  
{

	public void Check(String un,String pw) throws Validate,InValidate,Exception
	{
	if(un.equalsIgnoreCase("SaTya")&&pw.equals("a"))
		{
	Validate v = new Validate("Valid");
				throw(v);
		}

		else
		{
			InValidate i = new InValidate("InValid");
			throw(i);
		}
	
	}
	


}
