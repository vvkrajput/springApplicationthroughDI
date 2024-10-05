package com.example.BasicSpringBootProjectUsingDI;

public class Prod implements DB{

    @Override
    public String data() {
        return "Prod Data";
    }
}
