package com.isamm.clicktoshop.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommande;
	private Date dateCommande;
	private Collection<Ligne_Commande> Ligne_Commandes;
	private Acheteur  acheteur;
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Collection<Ligne_Commande> getLigne_Commandes() {
		return Ligne_Commandes;
	}
	public void setLigne_Commandes(Collection<Ligne_Commande> ligne_Commandes) {
		Ligne_Commandes = ligne_Commandes;
	}
	public Acheteur getAcheteur() {
		return acheteur;
	}
	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Date dateCommande, Collection<Ligne_Commande> ligne_Commandes) {
		super();
		this.dateCommande = dateCommande;
		Ligne_Commandes = ligne_Commandes;
	}
	
	
	
	

}
