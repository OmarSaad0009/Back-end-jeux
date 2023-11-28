package com.omar.jeux.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omar.jeux.entities.Genre;
import com.omar.jeux.entities.Jeu;
import com.omar.jeux.repos.GenreRepository;
import com.omar.jeux.service.JeuService;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRestController {
	
@Autowired
  GenreRepository  genreRepository;


@RequestMapping(method=RequestMethod.GET)
public List<Genre> getAllGenres()
{
   return genreRepository.findAll();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Genre getGenreById(@PathVariable("id") Long id) {
return genreRepository.findById(id).get();
}




}
