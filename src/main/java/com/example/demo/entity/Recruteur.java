package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Recruteur {
@Id
@GeneratedValue
long id;
String firstname;
String lastname;
String  email;
@OneToMany(mappedBy = "recruteur", cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
 private List<Condidat> condidat;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Condidat> getCondidat() {
	return condidat;
}
public void setCondidat(List<Condidat> condidat) {
	this.condidat = condidat;
}
public Recruteur(long id, String firstname, String lastname, String email, List<Condidat> condidat) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.condidat = condidat;
}

}
