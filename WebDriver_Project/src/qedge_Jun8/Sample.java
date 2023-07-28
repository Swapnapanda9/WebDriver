package qedge_Jun8;

public class Sample {
	public static String varify_String(String str1,String str2)
	{
		String res ="";
		if (str1.equalsIgnoreCase(str2))
		{
			res = "Strings are equal";
		}
		else
		{
			res= "Strings are not equal";
		}
		return res;
	}
	public static boolean xompare_values(int a,int b)
	{
	if(a==b)
	{
	return  true;	
	}
	else
	{
	return false;	
	}
	}

	public static void main(String[] args) {
		boolean x =Sample.xompare_values(100, 100);
		System.out.println(x);
		String res=Sample.varify_String("India", "India");
		System.out.println(res);

	}

}
