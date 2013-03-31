package validations;

import java.util.Date;

/**
 *
 * @author jlombardo
 */
public class RunExample2 {
    private static Date date;
    
    public static void main(String[] args) {
        // How do you handle exceptions?
        Employee e = new Employee();
        
        // This example use a try-catch to proactively prevent the program
        // from crashing. When the exception is caught, we are intercepting
        // it BEFORE it crashes the system, and then take appropriate action.
        
        // forgot to initialize date, therefore it's null! Use try-catch
        // to intercept... program will not crash
        try {
            e.setHireDate(date);
        }catch(IllegalArgumentException iae) {
            System.out.println("Sorry, " + iae.getMessage());
        }
    }
   
    
}
