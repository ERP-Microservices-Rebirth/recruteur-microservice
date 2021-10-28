package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Condidat {

	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private int NombreTelephone;
	private String experience;
	@ManyToOne
	Recruteur recruteur;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNombreTelephone() {
		return NombreTelephone;
	}
	public void setNombreTelephone(int nombreTelephone) {
		NombreTelephone = nombreTelephone;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Recruteur getRecruteur() {
		return recruteur;
	}
	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}
	public Condidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Condidat(long id, String nom, String prenom, int nombreTelephone, String experience, Recruteur recruteur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		NombreTelephone = nombreTelephone;
		this.experience = experience;
		this.recruteur = recruteur;
	}
	

}
