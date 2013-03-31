package exceptionbasics;

import javax.swing.JOptionPane;

public class Customer {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String zip;
    private String customerID;
    private String state;
    private String ssn;
    private String ERR_NULL = "Sorry cannot be null.";
    private String ERR_NO_NUMS = "Sorry cannot contain numbers.";
    private String ERR_HYP = "Must contain two hyphens.";
    private String ERR_CONTAIN_TEN = "Must contain 10 digits.";
    private String ERR_CONTAIN_FIVE = "Must contain 5 digits.";
    private String ERR_CONTAIN_NINE = "Must conatin 9 digits.";
    private String ERR_STATE_CONTAIN = "State must contain two letters.";
    private String EMPTY_STRING = "";
    private String HYP = "-";
    private int FIVE = 5;
    private int TWO = 2;
    private int THREE = 3;
    private int NINE = 9;
    private int TEN = 10;

    /**
     * This method gets the first name from a customer.
     *
     * @return - a first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method sets a first name for a customer.
     *
     * @param firstName - a validated first name. (Ex. Benjamin)
     * @throws - IllegalArgumentExceeption if first name is not valid.
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        char[] chars = firstName.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_NO_NUMS);
            }
        }
        this.firstName = firstName;
    }

    /**
     * This method gets the last name from a customer.
     *
     * @return - a last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method sets the first name for a customer.
     *
     * @param lastName - a validated last name. (Ex. Kling)
     * @throws - IllegalArgumentException if last name is not valid.
     */
    public void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        char[] chars = lastName.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_NO_NUMS);
            }
        }
        this.lastName = lastName;
    }

    /**
     * This method gets the phone from a customer.
     *
     * @return - a phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method sets a phone number for a customer.
     *
     * @param phone - a valid phone number. (Ex. 4145876175 or 414-587-6175)
     * @throws - IllegalArgumentException if phone number is not valid.
     */
    public void setPhone(String phone) throws IllegalArgumentException {
        if (phone == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        String[] pieces = phone.split(HYP);
        if (phone.contains(HYP) && pieces.length != THREE) {
            throw new IllegalArgumentException(ERR_HYP);
        }
        phone = phone.replaceAll(HYP, EMPTY_STRING);
        if (phone.length() != TEN) {
            throw new IllegalArgumentException(ERR_CONTAIN_TEN);
        }
        char[] chars = phone.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_CONTAIN_TEN);
            }
        }
        this.phone = phone;
    }

    /**
     * This method gets the address from a customer.
     *
     * @return - a address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method sets the address for a customer.
     *
     * @param address - a valid address. (Ex. 1000 South 108th Street)
     * @throws - IllegalArgumentException if address is not valid.
     */
    public void setAddress(String address) throws IllegalArgumentException {
        if (address == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        this.address = address;
    }

    /**
     * This method gets the zip code from a customer.
     *
     * @return - a zip code.
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method sets the zip for a customer.
     *
     * @param zip - a validated zip code. (Ex. 53214)
     * @throws - IllegalArgumentException if zip code is not valid to 5 digits.
     */
    public void setZip(String zip) throws IllegalArgumentException {
        if (zip == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        if (zip.length() != FIVE) {
            throw new IllegalArgumentException(ERR_CONTAIN_FIVE);
        }
        char[] chars = zip.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_CONTAIN_FIVE);
            }
        }
        this.zip = zip;
    }

    /**
     * This method gets the customer id from a customer.
     *
     * @return - customer id.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * This method sets the customer id for a customer.
     *
     * @param customerID - a valid customer id. (Ex. 12345)
     * @throws - IllegalArgumentException if customer id is not valid.
     */
    public void setCustomerID(String customerID) throws IllegalArgumentException {
        if (customerID == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        if (customerID.length() != FIVE) {
            throw new IllegalArgumentException(ERR_CONTAIN_FIVE);
        }
        char[] chars = customerID.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_CONTAIN_FIVE);
            }
        }
        this.customerID = customerID;
    }

    /**
     * This method gets the social security number from a customer.
     *
     * @return - a social security number.
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * A method that sets the SSN for a customer
     *
     * @param ssn - a 9 digit or 11 digit social security number (Ex. 1234567890
     * or 123-45-7890)
     * @throws - IllegalArgumentException if SSN is not a valid by the size
     */
    public void setSsn(String ssn) throws IllegalArgumentException {
        if (ssn == null) {
            throw new IllegalArgumentException(ERR_NULL);
        }
        String[] pieces = ssn.split(HYP);
        if (ssn.contains(HYP) && pieces.length != THREE) {
            throw new IllegalArgumentException(ERR_HYP);
        }
        ssn = ssn.replaceAll(HYP, EMPTY_STRING);
        if (ssn.length() != NINE) {
            throw new IllegalArgumentException(ERR_CONTAIN_NINE);
        }
        char[] chars = ssn.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ERR_CONTAIN_NINE);
            }
        }
        this.ssn = ssn;
    }

    /**
     * This method gets the state from a customer.
     *
     * @return - a state.
     */
    public String getState() {
        return state;
    }

    /**
     * A method that sets the state for this customer.
     *
     * @param state - a two-character abbreviation for state
     * @throws - IllegalArgumentException if state is not 2 characters in length
     */
    public void setState(String state) throws IllegalArgumentException {
        if (state == null || state.length() != TWO) {
            throw new IllegalArgumentException(ERR_STATE_CONTAIN);
        }
        this.state = state;
    }
}
