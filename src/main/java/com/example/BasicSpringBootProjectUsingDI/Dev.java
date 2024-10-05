package com.example.BasicSpringBootProjectUsingDI;

public class Dev implements DB{

    @Override
    public String data() {
        return "Dev Data";
    }
}
