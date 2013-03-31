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
            throw new IllegalArgumentException("Sorry first name connot be null.");
        }
        char[] chars = firstName.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("First name cannot contain numbers.");
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
            throw new IllegalArgumentException("Sorry last name cannot be null.");
        }
        char[] chars = lastName.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Last name cannot contain numbers.");
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
            throw new IllegalArgumentException("phone number cannot be null.");
        }
        String[] pieces = phone.split("-");
        if (phone.contains("-") && pieces.length != 3) {
            throw new IllegalArgumentException("Must have two hyphens.");
        }
        phone = phone.replaceAll("-", "");
        if (phone.length() != 9) {
            throw new IllegalArgumentException("Must have 10 digits.");
        }
        char[] chars = phone.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Must have 10 digits.");
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
     * @param address - a valid address. (Ex. 1000 South 108th Street)
     * @throws - IllegalArgumentException if address is not valid.
     */
    public void setAddress(String address) throws IllegalArgumentException {
        if(address == null){
            throw new IllegalArgumentException("Sorry address cannot be null.");
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
     * @param zip - a validated zip code. (Ex. 53214)
     * @throws - IllegalArgumentException if zip code is not valid to 5 digits. 
     */
    public void setZip(String zip) throws IllegalArgumentException {
        if(zip == null){
            throw new IllegalArgumentException("Sorry zip cannot be null.");
        }
        char[] chars = zip.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Must have 5 digits.");
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
     * @param customerID - a valid customer id. (Ex. 12345)
     * @throws - IllegalArgumentException if customer id is not valid.
     */
    public void setCustomerID(String customerID) throws IllegalArgumentException {
        if(customerID == null){
            throw new IllegalArgumentException("Sorry customer id cannot be null.");
        }
        char[] chars = customerID.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Must have 5 digits.");
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
            throw new IllegalArgumentException("Social Security Number cannot be null.");
        }
        String[] pieces = ssn.split("-");
        if (ssn.contains("-") && pieces.length != 3) {
            throw new IllegalArgumentException("Must have two hyphens.");
        }
        ssn = ssn.replaceAll("-", "");
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("Must have 9 digits.");
        }
        char[] chars = ssn.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Must have 9 digits.");
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
        if (state == null || state.length() != 2) {
            throw new IllegalArgumentException("state must be 2 characters in length.");
        }
        this.state = state;
    }
}
