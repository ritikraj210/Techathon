package com.example.scBackend.Exception;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(Long id) {
        super("The item id '" + id + "' does not exist in our records");
    }
}
