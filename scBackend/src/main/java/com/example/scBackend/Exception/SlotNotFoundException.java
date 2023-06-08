package com.example.scBackend.Exception;

public class SlotNotFoundException extends RuntimeException{
    public SlotNotFoundException(Long id) {
        super("The seller id '" + id + "' does not exist in our records");
    }
}
