package com.corejava.interview;

class BaseClass {
    
    // Private variable
    private final String msg = "Hello Geeks";
    
    // public method having private varialbe
    public void Msg() {
        
        System.out.println("Private variable having message: "+ msg);
    }
}

public class Geeks {
    
    public static void main(String []args){
      
      // Creating the object of BaseClass
      BaseClass obj = new BaseClass();
      //Calling the method from base class
      obj.Msg();
    }
}