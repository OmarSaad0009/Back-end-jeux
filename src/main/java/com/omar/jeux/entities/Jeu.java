package com.omar.jeux.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Jeu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idJeu;
	private String nomJeu;
	private Double prixJeu;
    private Date dateCreation;
    private String platform;
    
    @ManyToOne 
    private Genre genre;
    
	public Jeu() {
		super();
		
	}
	
	
		public Jeu(String nomJeu, Double prixJeu, Date dateCreation, String platform) {
			super();
			this.nomJeu = nomJeu;
			this.prixJeu = prixJeu;
			this.dateCreation = dateCreation;
			this.platform = platform;
		}
	
	
	
	public long getIdJeu() {
		return idJeu;
	}
	public void setIdJeu(long idJeu) {
		this.idJeu = idJeu;
	}
	public String getNomJeu() {
		return nomJeu;
	}
	public void setNomJeu(String nomJeu) {
		this.nomJeu = nomJeu;
	}
	public Double getPrixJeu() {
		return prixJeu;
	}
	public void setPrixJeu(Double prixJeu) {
		this.prixJeu = prixJeu;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}



	@Override
	public String toString() {
		return "Jeu [idJeu=" + idJeu + ", nomJeu=" + nomJeu + ", prixJeu=" + prixJeu + ", dateCreation=" + dateCreation
				+ ", platform=" + platform + "]";
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
    
    
}
