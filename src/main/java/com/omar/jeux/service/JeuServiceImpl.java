package com.omar.jeux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar.jeux.entities.Genre;
import com.omar.jeux.entities.Jeu;
import com.omar.jeux.repos.JeuRepository;

@Service
public class JeuServiceImpl implements JeuService{

	@Autowired
	JeuRepository jeuRepository;
	
	@Override
	public Jeu saveJeu(Jeu j) {
	
		return jeuRepository.save(j);
	}

	@Override
	public Jeu updateJeu(Jeu j) {
		return jeuRepository.save(j);
	}

	@Override
	public void deleteJeu(Jeu j) {
		return;
		
	}

	@Override
	public void deleteJeuById(Long id) {
		jeuRepository.deleteById(id);
		
	}

	@Override
	public Jeu getJeu(Long id) {
		return jeuRepository.findById(id).get();
	}
	
	
	@Override
	public List<Jeu> getAllJeux() {
		return jeuRepository.findAll();
	}

	@Override
	public List<Jeu> findByNomJeu(String nom) {
		return jeuRepository.findByNomJeu(nom);
		
	}

	@Override
	public List<Jeu> findByNomjeuContains(String nom) {
		return jeuRepository.findByNomJeuContains(nom);
	}

	@Override
	public List<Jeu> getByNomPrix(String nom, Double prix) {
		return jeuRepository.findByNomPrix(nom,prix);
	}

	@Override
	public List<Jeu> getByGenre(Genre genre) {
		return jeuRepository.findByGenre(genre);
	}

	@Override
	public List<Jeu> getByGenreIdG(Long id) {
		return jeuRepository.findByGenreIdG(id);
	}

	@Override
	public List<Jeu> getByOrderByNomJeuAsc() {
		return jeuRepository.findByOrderByNomJeuAsc();
	}

	@Override
	public List<Jeu> trierJeuxNomsPrix() {
		
		return jeuRepository.trierJeuxNomsPrix();
	}

	@Override
	public List<Jeu> findByGenreIdG(Long idG) {
		  
		        return jeuRepository.findByGenreIdG(idG);
		    
	}
	
	
	
	

}
