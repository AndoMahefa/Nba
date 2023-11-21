package vehicules.ressources.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import vehicules.ressources.repository.JoueurRepository;

@CrossOrigin
@RestController
public class JoueurController {
    
    private final JoueurRepository joueurRepo;

    public JoueurController(JoueurRepository joueurRepo){
        this.joueurRepo = joueurRepo;
    }

}
