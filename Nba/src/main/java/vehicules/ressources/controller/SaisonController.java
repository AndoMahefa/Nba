package vehicules.ressources.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vehicules.ressources.repository.SaisonRepository;
import vehicules.ressources.model.Saison;

@CrossOrigin
@RestController
public class SaisonController {
    
    SaisonRepository saisonRepo;

    public SaisonController(SaisonRepository saisonRepo){
        this.saisonRepo = saisonRepo ;
    }

    @GetMapping("/saisons")
  	public List<Saison> findAllSaisons() {
    	return this.saisonRepo.findAll();
  	}
}
