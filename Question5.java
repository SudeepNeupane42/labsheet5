
package labsheet5;

import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mobile user=new Mobile();
        System.out.print("Enter phone type:");
        String type=sc.next();
        System.out.print("Enter phone number:");
        String num=sc.next();
        
        try{
            if(num.length()!=10){
                throw  new PhoneNumberException("invalid phone number");
        }
        else{
            user.setDetails(type, num);
                System.out.println("phone type is "+user.getType()+" and phone number is "+user.getPhoneNumber());
        }
        }
        catch(PhoneNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
