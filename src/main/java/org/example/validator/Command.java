package org.example.validator;

import org.example.model.Result;

public interface Command {
    Result execute(String[] attributes) throws Exception;
    boolean validate(String[] attributes)throws Exception;
}
