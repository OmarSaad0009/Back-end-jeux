package com.omar.jeux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.omar.jeux.entities.Genre;
import com.omar.jeux.entities.Jeu;

@SpringBootApplication
public class JeuxApplication implements CommandLineRunner{
	
	@Autowired
    private RepositoryRestConfiguration reprositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(JeuxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		reprositoryRestConfiguration.exposeIdsFor(Jeu.class,Genre.class);
		
	}

}
