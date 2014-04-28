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
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Long id;

        private String street1, street2, city, myState, zip, country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "com.aperea.clscustomerforms.Address[ id=" + id + " ]";
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMyState() {
        return myState;
    }

    public void setMyState(String myState) {
        this.myState = myState;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
