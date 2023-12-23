package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class SubCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
         int sub = Integer.valueOf(attributes[0]);
         for (int i = 1; i<attributes.length;i++){
             sub -= Integer.valueOf(attributes[i]);
         }
            return Result.builder().message("Substraction of given numbers : ").result(sub).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Enter two or more numbers to substract !");
        }
        return true;
    }
}
