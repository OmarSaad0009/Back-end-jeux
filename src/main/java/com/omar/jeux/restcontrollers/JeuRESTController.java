package com.omar.jeux.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omar.jeux.entities.Jeu;
import com.omar.jeux.service.JeuService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JeuRESTController {
	
	@Autowired
	JeuService jeuService;
	
	@RequestMapping(path="all",method=RequestMethod.GET)
	List<Jeu> getAllJeux()
	{
		return jeuService.getAllJeux();
		
	}
	
	@RequestMapping(value="getbyid/{id}",method=RequestMethod.GET)
	public Jeu getJeuById(@PathVariable("id")Long id){
		return jeuService.getJeu(id);
	}
	
	@RequestMapping(value="/addjeu", method=RequestMethod.POST)
	//@PostMapping("/addjeu")
	public Jeu CreateJeu(@RequestBody Jeu jeu){
		return jeuService.saveJeu(jeu);
	}
	
	@RequestMapping(value="/updatejeu",method = RequestMethod.PUT)
	//@PutMapping("/updatejeu")
	public Jeu UpdateJeu(@RequestBody Jeu jeu){
		return jeuService.updateJeu(jeu);
	}

	@RequestMapping(value="/deljeu/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/deljeu/{id}")
	public void deleteJeu(@PathVariable("id") Long id)
	{
		jeuService.deleteJeuById(id);
	}
	
	@RequestMapping(value="/prodcast/{idG}",method = RequestMethod.GET)
	public List<Jeu> getJeuxByIdG(@PathVariable("idG") Long idG)
	{
		return jeuService.findByGenreIdG(idG);
	}
	
	@RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
	public List<Jeu> findByNomJeuContains(@PathVariable("nom") String nom) {
	return jeuService.findByNomjeuContains(nom);
	}
	
	
}
