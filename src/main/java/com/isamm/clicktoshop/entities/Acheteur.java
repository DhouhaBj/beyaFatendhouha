package com.isamm.clicktoshop.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Acheteur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAcheteur;
	private String nomAcheteur ;
	private String adresse ;
	private String email ;
	private String tel ;
	private int quantite ;
	private Collection<Commande> commandes;
	public Long getIdAcheteur() {
		return idAcheteur;
	}
	public void setIdAcheteur(Long idAcheteur) {
		this.idAcheteur = idAcheteur;
	}
	public String getNomAcheteur() {
		return nomAcheteur;
	}
	public void setNomAcheteur(String nomAcheteur) {
		this.nomAcheteur = nomAcheteur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	public Acheteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acheteur(String nomAcheteur, String adresse, String email, String tel, int quantite) {
		super();
		this.nomAcheteur = nomAcheteur;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.quantite = quantite;
	}
	
	
	

}
