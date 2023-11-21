package vehicules.ressources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicules.ressources.model.MatchStatistique;

public interface MatchStatistiqueRepository extends JpaRepository<MatchStatistique,Integer>{
    
}
