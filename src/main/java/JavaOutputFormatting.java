import java.util.Scanner;

public class HackerRankJavaOutputFormatting {

	public static void main(String[] args) {
		
		
		//System.out.format("%-3s", "test", "%3s", "test");
		//System.out.println(String.format("%15s", "test")+ String.format("%03", 1));
		//System.out.printf("%-3s, %03i", "test", 10);
		
		
		
		   Scanner sc=new Scanner(System.in);
           System.out.println("================================");
           for(int i=0;i<3;i++){
               String s1=sc.next();
               int x=sc.nextInt();
               System.out.printf("%1$-15s%2$03d \n", s1, x);           
           }
           sc.close();
           System.out.println("================================");


	}

}
