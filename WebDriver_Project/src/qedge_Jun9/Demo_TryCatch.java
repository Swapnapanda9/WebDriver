package qedge_Jun9;

public class Demo_TryCatch {

	public static void main(String[] args) {
		// Divide any thing with zero
		try {
		int a =9876 ,b= 0,c;
		c=a/b;
		System.out.println(c);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		int x= 56786,y =98,z;
		z=x/y;
		System.out.println(z);
 
	}

}
