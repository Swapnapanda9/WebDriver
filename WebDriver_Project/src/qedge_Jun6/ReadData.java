package qedge_Jun6;
import java.io.*;
public class ReadData {

	public static void main(String[] args) throws Throwable {
		// Read data from existing file
		FileReader fr = new FileReader("D://selenium.txt");
		BufferedReader br = new BufferedReader(fr);
		//To store line by line data
		String str = "";
		while ((str = br.readLine())!=null)
		{
			Thread.sleep(4000);
			System.out.println(str);
		}
		br.close();

	}

}

