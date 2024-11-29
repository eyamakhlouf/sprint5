package com.eya.livres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eya.livres.entities.Genre;
import com.eya.livres.entities.Livre;

@RepositoryRestResource(path = "rest")
public interface LivreRepository extends JpaRepository<Livre, Long> {

	List<Livre> findByTitreLivre(String titre);
	List<Livre> findByTitreLivreContains(String titre); 
	
	/*@Query("select l from Livre l where l.titreLivre like %?1 and l.prixLivre > ?2")
	 List<Livre> findByTitrePrix (String titre, Double prix);*/
	
	 @Query("select l from Livre l where l.titreLivre like  %:titre and l.prixLivre > :prix")
	 List<Livre> findByTitrePrix (@Param("titre") String titre,@Param("prix") Double prix);
	
	 @Query("select l from Livre l where l.genre = ?1")
	 List<Livre> findByGenre(Genre genre);
	 
	 List<Livre> findByGenreIdGen(Long id);
	 
	 List<Livre> findByOrderByTitreLivreAsc();
	 
	 @Query("select l from Livre l order by l.titreLivre ASC, l.prixLivre DESC")
	 List<Livre> trierLivresTitresPrix ();
	
	
	
	

	
	 
	 
}
