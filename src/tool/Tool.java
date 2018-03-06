package tool;

import java.io.Writer;
import java.util.ArrayList;

public class Tool {
   public static int add(int i, int j) {
      return i + j;
   }

   public static void i(Object i) {
      System.out.println(i);
   }

   public static void i(int i) {
      System.out.println(i);
   }

   public static void writeLine(Writer out, String ln) throws Exception {
      char[] ch = ln.toCharArray();

      for (int i = 0; i < ln.length(); i++) {
         out.write(ch[i]);
         out.flush();
      }
      out.write('\r');
      out.write('\n');
   }// writeLine

   public static void writeArr(Writer out, ArrayList<String> arr) throws Exception {
      for (String ln : arr) {
         out.write(ln);
         out.flush();
         out.write('\r');
         out.write('\n');
      }
   }

   public static synchronized void delay(int time) {

      try {
         Thread.sleep(time);
      } catch (Exception e) {
         
      }
   }
   
   public static synchronized void randomDelay(int time){
      try {
         int r =(int)(Math.random()*1000);
         Thread.sleep(r);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   

}