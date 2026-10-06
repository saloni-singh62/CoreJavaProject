package Day2_ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(){

    }
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
