package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class FactCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
           for (String number : attributes){
               int fact =1;
               for (int i = 1 ; i<=Integer.valueOf(number);i++){
                   fact *= i;
               }
               System.out.println("Factorial of "+number+" is : " +fact);
           }
            return Result.builder().message("This are yours factorial !").build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to find fictorial !");
        }
        return true;
    }
}
