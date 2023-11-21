package vehicules.ressources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicules.ressources.model.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer>{
    
}
