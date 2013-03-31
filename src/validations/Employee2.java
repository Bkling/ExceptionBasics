package validations;

import java.util.Date;

/**
 *
 * @author jlombardo
 */
public class Employee2 {
    private String lastName;
    private Date hireDate;
    private int yearsWithCompany;
    private boolean retired;
    private Date[] vacationDays;
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MIN_ARRAY_LENGTH = 0;

    /*
     * Validate an object - check for null only, unless you care about
     * the content, in which case you would need to do more.
     */
    public void setHireDate(Date hireDate) throws HireDateException {
        if(hireDate == null) {
           throw new HireDateException("hireDate cannot be null");
        }
        this.hireDate = hireDate;
    }

    /*
     * Validate a String, check for null and min. length. Must check for
     * null first because there would be no length() method on a null
     * object -- it's not an object, silly!
     */
    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() <= MIN_NAME_LENGTH) {
            // String is a magic number, should be a constant!
            throw new IllegalArgumentException("lastName must be at least " 
                    + MIN_NAME_LENGTH + " characters");
        }
        this.lastName = lastName;
    }

    /*
     * boolean values need no validation, unless you are using the type
     * wrapper object variation (Boolean). Then you must check for null.
     */
    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    /*
     * Arrays are treated as objects in Java, therefore you must check at 
     * least for null, and depending on your requirements, you might also
     * need to check for a minimum length.
     */
    public void setVacationDays(Date[] vacationDays) {
        if(vacationDays == null || vacationDays.length <= MIN_ARRAY_LENGTH) {
            // String is a magic number, should be a constant!
            throw new IllegalArgumentException("vacationDays is a required field");
        }
        this.vacationDays = vacationDays;
    }

    /*
     * Numeric primitives may need different kinds of validation. You may
     * need to check for a minimum value only, or check for a maximum value
     * only, or check for a range of values.
     */
    public void setYearsWithCompany(int yearsWithCompany) {
        // Magic numbers should NOT be used!
        if( yearsWithCompany <= 0 || yearsWithCompany > 50) {
             // String is a magic number, should be a constant!
           throw new IllegalArgumentException("yearsWithCompany must be in the range 0 to 50");
        }
        this.yearsWithCompany = yearsWithCompany;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRetired() {
        return retired;
    }

    public Date[] getVacationDays() {
        return vacationDays;
    }

    public int getYearsWithCompany() {
        return yearsWithCompany;
    }
    
    
}
