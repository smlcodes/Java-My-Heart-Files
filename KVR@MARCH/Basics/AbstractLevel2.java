class ConstructorUsingThis 
{
	int a,b;

	ConstructorUsingThis()
	{   
		this(100);
		System.out.println("______________________________________________________________________");
		System.out.println("Defalut cons");
	}

	ConstructorUsingThis(int a)
	{
		this(200,200);
		this.a = a;
		System.out.println("______________________________________________________________________");
		System.out.println("1 param: a	:"+a);
	}
ConstructorUsingThis(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("______________________________________________________________________");
		System.out.println("2 param: a	:"+a);
		System.out.println("2 param: b	:"+b);
	}
	
	
	ConstructorUsingThis(ConstructorUsingThis T)
	{
	System.out.println("______________________________________________________________________");
	System.out.println("I AM FROM OBJECT PARAMETERIZED CONSTRUCTOR..");
	this.a = T.a;
	this.b = T.b;
	System.out.println("OBJECT PARAMETERIZED CONSTRUCTOR	:a:	"+T.a+"	 b	:"+T.b);
	
	}

	public static void main(String[] args) 
	{
		System.out.println("from Exection logic");
		System.out.println("______________________________________________________________________");
		ConstructorUsingThis ob1 = new ConstructorUsingThis();
		ConstructorUsingThis ob2 = new ConstructorUsingThis(100);
		ConstructorUsingThis ob3 = new ConstructorUsingThis(100,200);
		ConstructorUsingThis ob4 = new ConstructorUsingThis(ob3);

	}
}
  A�W�7  A�W? ,I  AM FROM  OBJECT P ARAMETER IZED CON STRUCTOR .. A %�		:a:	 �C W	 � AFEAFpF -QzVH��T��mai �([�EA1K@�from Ex��ion �logicAy6
N�M=�args��
�A�b1B2B3B f
SourPceFi����.��  �e@�� ۀ�@ �hB `t�6"
�M     *d� �� � � �� �@ � 8 � �<� �	  
  �� !�A Ar �.* �@ � "*� %h� 'Y )� +� -(� 1*�_  *� �@x -����  .��.ae" $���A C*� 5A"*� 7�9w���;�  �Q�(  @� �  , , B��� �c  �C�C�Cb0 %h =��`	!J��>�!*+�l %`&� 7��@�A�&B� D-`7P(�       !  "@$# I 6%8C)J�8J �G��H`�/�  � �:�J��� Y�� LL� HM#�=N�-� M:Ic)�H*  *+b'" ;/�99 
0b4 &  : �O P� Qb*"�R �� �S  9�(T 
� U� V  �?����  ?��???????�????????�????????�??????��������������L���  ��@ �??�????????�????????�????????�???�����������������_T���p  O����� �������  O�������������	  O�