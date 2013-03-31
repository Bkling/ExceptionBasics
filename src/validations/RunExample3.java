package validations;

import java.util.Date;

/**
 *
 * @author jlombardo
 */
public class RunExample3 {
    private static Date date;
    
    public static void main(String[] args) {
        // How do you handle exceptions?
        Employee2 e = new Employee2();
        
        // If the exception being thrown is not a sub-class of RuntimeException 
        // then you MUST use a try-catch ... it is not optional as it is
        // in RunExample1. Try it...
        
        // Uncomment the next line to see that this is not allowed
        //e.setHireDate(date);
        // run the program and it crashes!
        
        // Here is what you must do...
        try {
            e.setHireDate(date);
        } catch(HireDateException hde) {
            // The action you take is up to you. For simplicity we will just
            // send a message to the console, but this is NOT what you would
            // want to do in a real application. You would probably send the
            // error message back to the GUI.
            System.out.println("Sorry, " + hde.getMessage());
        }
    }
   
    
}
