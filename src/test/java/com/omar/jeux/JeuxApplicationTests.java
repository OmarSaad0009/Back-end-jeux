package com.omar.jeux;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.omar.jeux.entities.Genre;
import com.omar.jeux.entities.Jeu;
import com.omar.jeux.repos.JeuRepository;

@SpringBootTest
class JeuxApplicationTests {

	@Autowired
	private JeuRepository jeuRepository;
	@Test
	public void testCreateJeu() {
		Jeu j = new Jeu("Fifa 23",1500.500,new Date(), "Play Station 4");
		jeuRepository.save(j);
	}
	
	@Test
	public void testfindJeu()
	{
		Jeu je= jeuRepository.findById(1L).get();
		System.out.println(je);
	}
	
	@Test
	public void testUpdateJeu()
	{
		Jeu je= jeuRepository.findById(1L).get();
		je.setPrixJeu(1000.0);
		jeuRepository.save(je);
		System.out.println(je);
	}
	
	@Test
	public void testDeleteJeu()
	{
		jeuRepository.deleteById(1L);
	}
	
	
	@Test
	public void testfindAllJeux()
	{
		List<Jeu> jex = jeuRepository.findAll();
		for(Jeu je:jex)
			System.out.println(je);
	}
	
	
	@Test
	public void testfindJeuByNom()
	{
		List<Jeu> jex= jeuRepository.findByNomJeu("Valorant");
		
		for(Jeu je:jex)
		System.out.println(je);
	}
	
	
	@Test
	public void testfindJeuByNomContains()
	{
		List<Jeu> jex= jeuRepository.findByNomJeuContains("J");
		
		for(Jeu je:jex)
		System.out.println(je);
	}
	
	@Test
	public void testfindJeuByNomPrix()
	{
		List<Jeu> jex= jeuRepository.findByNomPrix("Valorant", 500.0);
		
		for(Jeu je:jex)
		{
		System.out.println(je);
		}
	}
	
	
	@Test
	public void testfindByGenre()
	{
		Genre g = new Genre();
		g.setIdG(1L);
		
		
		List<Jeu> jex = jeuRepository.findByGenre(g);
		
		for(Jeu je:jex)
		{
		System.out.println(je);
		}
	}
	
	
	@Test
	public void testfindByGenreIdG()
	{
		
		
		List<Jeu> jex = jeuRepository.findByGenreIdG(1L);
		
		for(Jeu je:jex)
		{
		System.out.println(je);
		}
	}
	
	
	@Test
	public void testfindByOrderByNomJeuAsc()
	{
		
		
		List<Jeu> jex = jeuRepository.findByOrderByNomJeuAsc();
		
		for(Jeu je : jex)
		{
		System.out.println(je);
		}
	}
	
	
	@Test
	public void testTrierJeuxNomsPrix()
	{
		
		
		List<Jeu> jex = jeuRepository.trierJeuxNomsPrix();
		
		for(Jeu je : jex)
		{
		System.out.println(je);
		}
	}

}
