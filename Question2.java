
package labsheet5;

import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        int[] arr={1,4,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of array:");
        try{
            for(int i=0;i<4;i++){
                System.out.println(arr[i]);
            
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception "+e.getMessage());
        }
    }
}
