class A8
{
	public static float test(boolean b, int i,char j,int k)
	{
		System.out.println("from test");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		return 200f;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		System.out.println(test(false,20,'b',30));
		System.out.println("main end");
	
	}
}
