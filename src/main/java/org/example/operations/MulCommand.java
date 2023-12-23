package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class MulCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int mul =1;
            for (String attribute : attributes){
                mul *= Integer.valueOf(attribute);
            }
            return Result.builder().message("Multiplication of given numbers : ").result(mul).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Enter two or more numbers to Multiply !");
        }
        return true;
    }
}
