class ConstructorDemo3 
{
	int aa,bb;

	ConstructorDemo3(ConstructorDemo3 T)
	{
	System.out.println("______________________________________________________________________");
	System.out.println("I AM FROM OBJECT PARAMETERIZED CONSTRUCTOR..");
	aa = T.aa;
	bb = T.bb;
	System.out.println("OBJECT PARAMETERIZED CONSTRUCTOR	:aa:	"+T.aa+"	 bb	:"+T.bb);
	
	}


	ConstructorDemo3()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("Defalut cons");
	}

	ConstructorDemo3(int a)
	{
		aa = a;
		System.out.println("______________________________________________________________________");
		System.out.println("1 param: a	:"+aa);
	}
ConstructorDemo3(int a,int b)
	{
		aa = a;
		bb = b;
		System.out.println("______________________________________________________________________");
		System.out.println("2 param: a	:"+aa);
		System.out.println("2 param: b	:"+bb);
	}

	public static void main(String[] args) 
	{
		System.out.println("from Exection logic");
		System.out.println("______________________________________________________________________");
		ConstructorDemo3 ob1 = new ConstructorDemo3();
		ConstructorDemo3 ob2 = new ConstructorDemo3(100);
		ConstructorDemo3 ob3 = new ConstructorDemo3(100,200);
		ConstructorDemo3 ob4 = new ConstructorDemo3(ob3);

	}
}
  ��3  �YBOO (AnAH_ystem o
u@Czio/P��yt {eam; � append <-(Ђ�s (DI)�to�� (
 �*$P p�'l@�Q$V  �� �w� @�@ ��A@   @Y @   1*�  *� * � � �  Y�  � � 	

  � �� �  @@�      	    
 0 � R� - V�����  Y(�X LeG� Q  � D $��,  �   a/3��???6	O?O?? �r�$P���
?(&#;#ca� ^x^R��_?%��