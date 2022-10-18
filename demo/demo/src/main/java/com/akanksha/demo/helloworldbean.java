package com.akanksha.demo;

public class helloworldbean {
 
    
    private String message;

    public String getMessage() {
        return this.message;
    }

    public helloworldbean(String message)
    {
        this.message=message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return String.format("helloworldbean [message=%s]",message);
    }
    
        
    



    


    

}
