class A3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i= test();
		System.out.println("main end");
		System.out.println(test());
	}
	public static int test() 
	{
		System.out.println("test method");
	return 100;
	}
}
