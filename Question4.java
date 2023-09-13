
package labsheet5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Question4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers: ");
    try{
    int a=sc.nextInt();
    int b=sc.nextInt();
    int diff=a/b;
    System.out.println("sum is "+diff);
        }catch(InputMismatchException e){
        System.out.println("input mismatch exception");
    }
    catch(ArithmeticException e){
        System.out.println("arithmetic exception");
    }
    }
}
