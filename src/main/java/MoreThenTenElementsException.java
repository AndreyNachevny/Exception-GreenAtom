import java.io.PrintStream;
import java.io.PrintWriter;

public class MoreThenTenElementsException extends Exception{

    private String message;

    public MoreThenTenElementsException(String msg){
        super(msg);
        this.message = msg;
    }

    @Override
    public Throwable fillInStackTrace(){
        return super.fillInStackTrace();
    }

    @Override
    public Throwable getCause(){
        return null;
    }

    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public String getLocalizedMessage(){
        return getMessage();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    @Override
    public String toString(){
        return "MoreThenTenElementsException: " + this.message;
    }
}
