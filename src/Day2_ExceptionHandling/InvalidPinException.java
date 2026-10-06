package Day2_ExceptionHandling;

public class InvalidPinException extends RuntimeException{
    public InvalidPinException(){

    }
    public InvalidPinException(String msg){
     super(msg); // calling Parent class constructor super call
    }
}
