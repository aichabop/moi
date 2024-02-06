package services;

import entities.Carte;
import repositories.CarteRepository;

public class CarteService {
    private CarteRepository CarteRepository=new CarteRepository();

    public void addCarte(Carte carte){
        CarteRepository.insert(carte);
        
    }
    

        
    }
    

