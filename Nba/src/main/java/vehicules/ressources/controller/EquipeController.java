package vehicules.ressources.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import vehicules.ressources.repository.EquipeRepository;
import vehicules.ressources.model.StatistiqueSaison;
import vehicules.ressources.model.Equipe;
import vehicules.ressources.repository.StatistiqueSaisonRepository;

@CrossOrigin
@RestController
public class EquipeController {

    private final EquipeRepository equipeRepo ;
    private final StatistiqueSaisonRepository statistiqueRepo ;

    public EquipeController(EquipeRepository equipeRepo,StatistiqueSaisonRepository statistiqueRepo){
        this.equipeRepo = equipeRepo ;
        this.statistiqueRepo = statistiqueRepo ;
    }

    @GetMapping("/equipes")
  	public List<Equipe> findAllEquipes() {
    	return this.equipeRepo.findAll();
  	}

    @GetMapping("/equipes/{idequipe}/{idsaison}")
  	public List<StatistiqueSaison> showStatistique(@PathVariable( "idequipe" ) Integer idEquipe,@PathVariable( "idsaison" ) Integer idSaison) {
    	return this.statistiqueRepo.getStatistiqueSaison(idEquipe, idSaison);
  	}
}
