package qedge_Jun8;

public class Swapna {
	// Global variables
		static int a,b,c;
		static double x,y,z;
		public static void add()
		{
			a=5674;
			b=678;
			c=a+b;
			System.out.println(c);
		}
	public static void mul()
	{
		a=987;
		b=865;
		c=a*b;
		System.out.println(c);
	}
	public void sub()//non static method
	{
		a=4566;
		b=234;
		c=a-b;
		System.out.println(c);
	}
	public static void div()
	{
		x=567;
		y=5678;
		z=x/z;
		System.out.println(z);
	}

		public static void main(String[] args) {
		//Calling Static method with class name
	Swapna.add();
	Swapna.mul();
	Swapna.div();
	//Creating reference object to call non static methods
	Swapna ss = new Swapna();
	ss.sub();

		}



	}


