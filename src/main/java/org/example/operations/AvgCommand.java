package org.example.operations;

import org.example.model.Result;
import org.example.validator.Command;

public class AvgCommand implements Command {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int sum = 0 ;
         for (String number : attributes){
             sum += Integer.valueOf(number);
         }
         double avg = sum/attributes.length;
            return Result.builder().message("Average of given numbers is : ").result(avg).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to get average !");
        }
        return true;
    }
}
