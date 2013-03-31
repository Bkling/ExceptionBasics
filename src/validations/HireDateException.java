/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validations;

/**
 *
 * @author jlombardo
 */
public class HireDateException extends Exception {

    /**
     * Creates a new instance of <code>HireDateException</code> without detail message.
     */
    public HireDateException() {
    }

    /**
     * Constructs an instance of <code>HireDateException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public HireDateException(String msg) {
        super(msg);
    }
}
