
package labsheet5;

import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String ans="";
    do{
    System.out.println("enter two numbers: ");
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    try{
        int diff=a/b;
        System.out.println("difference is "+diff);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("do you want to continue?");
        ans=sc.next();
    }
    }while(ans.equalsIgnoreCase("y"));
    
    
    }  
    
}
