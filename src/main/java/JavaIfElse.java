import java.util.Scanner;

public class HcakerRankJavaIfElse {

	 public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt(); 
         sc.close();
         String ans="";
         if(n%2==1){
           ans = "Weird";
         }
         else{
         
           if(1<n && n<6)
        	   ans = "Not Weird";
           if(5<n && n<21)
        	   ans = "Weird";
           if(n>20)
        	   ans = "Not Weird";
         }
         System.out.println(ans);
         
     }

}
