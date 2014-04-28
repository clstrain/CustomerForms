/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aperea.clscustomerforms;

import java.io.Serializable;

/**
 *
 * @author Armando
 */

public class Requestor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String firstName, lastName, email;

    private Company company;

   private Registration registration;

    public Requestor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  

    @Override
    public String toString() {
        return "com.aperea.clscustomerforms.Requestor[ id=" + id + " ]";
    }

    public String getFirstName() {
        return firstName;
    }

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

    public Company getCompany() {
        if (company==null)
        {
            company = new Company();
        }
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Registration getRegistration() {
        if (registration == null) {
            registration = new Registration();
        }
        return registration;

    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

}
