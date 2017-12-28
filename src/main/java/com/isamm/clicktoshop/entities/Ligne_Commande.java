package com.isamm.clicktoshop.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ligne_Commande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ligne_Commande;
	private Produit produit;
	private int quantite;
	private double prix;
	private Commande commande;
	public Long getId_ligne_Commande() {
		return id_ligne_Commande;
	}
	public void setId_ligne_Commande(Long id_ligne_Commande) {
		this.id_ligne_Commande = id_ligne_Commande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Ligne_Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ligne_Commande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}
	
	
	

}
