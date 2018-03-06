package test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args)throws Exception {
		InputStream in = new FileInputStream("D:\\aa.txt");
		OutputStream out = new FileOutputStream("D:\\гоюл.txt");

		int r = 0;
		while( (r=in.read() ) != -1 )  {
			out.write(r);
		}
			
		
		
		in.close();		
		out.close();
		

	}

}
