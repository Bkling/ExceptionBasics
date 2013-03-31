package validations;

import java.util.Date;

/**
 *
 * @author jlombardo
 */
public class RunExample1 {
    private static Date date;
    
    public static void main(String[] args) {
        // How do you handle exceptions?
        Employee e = new Employee();
        
        // One way is to use a try-catch, but if the exception being
        // thrown is a sub-class of RuntimeException (such as is the case
        // with IllegalArgumentException, you aren't foreced to do this.
        // The exception will then crash your program. Try it...
        
       // forgot to initialize date, therefore it's null!
        e.setHireDate(date);
        // run the program and it crashes!
    }
   
    
}
