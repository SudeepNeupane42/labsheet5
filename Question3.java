
package labsheet5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers: ");
    try{
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("sum is "+sum);
        }catch(InputMismatchException e){
        System.out.println("input mis match "+e.getMessage());
    }
    }
}
