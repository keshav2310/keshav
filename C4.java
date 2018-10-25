class C4 
{
	static int x=10;
	static void test()
	{
	static x=20;
	System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+x);
		test();
		System.out.println("main end"+x);
	}
}
