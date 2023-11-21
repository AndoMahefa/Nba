package vehicules.ressources.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vehicules.ressources.model.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur,Integer>{
    @Query(value="SELECT * FROM joueur WHERE id_equipe= :idEquipe",nativeQuery = true)
    public List<Joueur> findByidEquipe(@Param("idEquipe") int idEquipe);
}
