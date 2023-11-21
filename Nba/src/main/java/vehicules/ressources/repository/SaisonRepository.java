package vehicules.ressources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicules.ressources.model.Saison;

public interface SaisonRepository extends JpaRepository<Saison,Integer>{
    
}
