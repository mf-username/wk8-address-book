package com.example.addressbook.model;

/**
 * Stores contact details
 */
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * Creates a contact from parameters
     * @param firstName the contacts first name
     * @param lastName  the contacts last name
     * @param email     the contacts email
     * @param phone     the contacts phone number
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the first name of a contact
     * @return A string of the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name of a contact
     * @param firstName the contacts first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}