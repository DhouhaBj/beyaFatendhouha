package com.isamm.clicktoshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_panier;
}
