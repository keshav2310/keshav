class  O
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if((flag = flag)&&(flag =true))
		{
		System.out.println("Hello World!");
	}
	System.out.println("end of main");
	System.out.println(flag);
	}
}
