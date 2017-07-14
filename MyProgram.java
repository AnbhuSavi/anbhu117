import java.util.Scanner;


public class MyProgram {

    
    public static void main(String[] args) {
       String str;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the input");
       str=in.nextLine();
       int len=str.length();
       int x=0;
       for(int i=0;i<len;i++)
       {
           x=x+str.charAt(i);
       }
       char c=(char)(x/len);
       System.out.println(c);
    }
    
}
