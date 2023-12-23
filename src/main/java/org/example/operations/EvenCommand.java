package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class EvenCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            for (String number : attributes){
                if (Integer.valueOf(number) % 2 ==0){
                    System.out.println(number +" is a Even Number.");
                }else {
                    System.out.println(number +" is not a Even Number.");
                }
            }
            return Result.builder().message("These are sollutions for Even numbers !").build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one numbre to check number is Even or Not");

        }
        return true;
    }
}
