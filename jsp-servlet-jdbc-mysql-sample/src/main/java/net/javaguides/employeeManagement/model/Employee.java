package net.javaguides.employeeManagement.model;

import java.io.Serializable;

public class Employee implements Serializable{
    
    /**
     * <h2> serialVersionUID</h2>
     * <p>
     * serialVersionUID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * <h2> firstName</h2>
     * <p>
     * firstName
     * </p>
     */
    private String firstName;
    
    /**
     * <h2> lastName</h2>
     * <p>
     * lastName
     * </p>
     */
    private String lastName;
    
    /**
     * <h2> username</h2>
     * <p>
     * username
     * </p>
     */
    private String username;
    
    /**
     * <h2> password</h2>
     * <p>
     * password
     * </p>
     */
    private String password;
    
    /**
     * <h2> address</h2>
     * <p>
     * address
     * </p>
     */
    private String address;
    
    /**
     * <h2> contact</h2>
     * <p>
     * contact
     * </p>
     */
    private String contact;
    
    /**
     * <h2> getFirstName</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * <h2> setFirstName</h2>
     * <p>
     * 
     * </p>
     *
     * @param firstName
     * @return void
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * <h2> getLastName</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * <h2> setLastName</h2>
     * <p>
     * 
     * </p>
     *
     * @param lastName
     * @return void
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * <h2> getUsername</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * <h2> setUsername</h2>
     * <p>
     * 
     * </p>
     *
     * @param username
     * @return void
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * <h2> getPassword</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * <h2> setPassword</h2>
     * <p>
     * 
     * </p>
     *
     * @param password
     * @return void
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * <h2> getAddress</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * <h2> setAddress</h2>
     * <p>
     * 
     * </p>
     *
     * @param address
     * @return void
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * <h2> getContact</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getContact() {
        return contact;
    }
    
    /**
     * <h2> setContact</h2>
     * <p>
     * 
     * </p>
     *
     * @param contact
     * @return void
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
}
