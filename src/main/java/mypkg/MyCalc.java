package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{		
		return a-b;
	}
	public int mul(int a, int b)
	{		
		return a*b;
	}
	
	public static void main(String[] args) {
		
		MyCalc ob = new MyCalc();
		System.out.println("Sum is "+ob.sum(30, 20));
		System.out.println("Diff is "+ob.diff(30, 20));	
		System.out.println("Diff is "+ob.mul(30, 20));
	}
}
