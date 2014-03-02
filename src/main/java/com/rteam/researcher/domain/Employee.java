package com.rteam.researcher.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEPHONE")
    private String telephone;

    public Integer getId() {
    	return this.id;
    }
    public void setId(Integer id) {
    	this.id = id;
    }
    public String getFirstName() {
    	return this.firstname;
    }
    public void setFirstName(String firstName) {
    	this.firstname = firstName;
    }
    public String getLastName() {
    	return this.lastname;
    }
    public void setLastName(String lastName) {
    	this.lastname = lastName;
    }
    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    public String getTelephone() {
    	return this.telephone;
    }
    public void setTelephone(String telephone) {
    	this.telephone = telephone;
    }
}