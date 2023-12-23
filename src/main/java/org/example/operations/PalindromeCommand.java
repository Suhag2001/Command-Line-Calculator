package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class PalindromeCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){

            for(String number : attributes){
                int rev =0;
                int temp =  Integer.valueOf(number);
                while (temp>0){
                    int rem = temp%10 ;
                    rev = rev*10 + rem ;
                    temp /= 10;
                }
                if (Integer.valueOf(number) == rev){
                    System.out.println(number +" is a Palindrome Number.");
                }else {
                    System.out.println(number +" is not a Palindrome Number.");
                }
            }
            return Result.builder().message(" This are yours Palindrome Solutions ! ").build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to check Palindrome or Not !");
        }
        return true;
    }
}
