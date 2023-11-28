package com.omar.jeux.service;

import java.util.List;

import com.omar.jeux.entities.Genre;
import com.omar.jeux.entities.Jeu;

public interface JeuService {
	
	Jeu saveJeu(Jeu j);
	Jeu updateJeu(Jeu j);
	void deleteJeu(Jeu j);
	void deleteJeuById(Long id);
	Jeu getJeu(Long id);
	List<Jeu> getAllJeux();
	
	List<Jeu> findByNomJeu(String nom);
	List<Jeu> findByNomjeuContains(String nom);
	List<Jeu> getByNomPrix(String nom, Double prix);
	List<Jeu> getByGenre(Genre genre);
	List<Jeu> getByGenreIdG(Long id);
	List<Jeu> getByOrderByNomJeuAsc();
	List<Jeu> trierJeuxNomsPrix();
	List<Jeu> findByGenreIdG(Long idG);
}
