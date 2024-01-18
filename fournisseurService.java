package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.fournisseur;
import com.example.demo.repository.fournisseurRepository;
@Service
public class fournisseurService  implements InterFournisseurService{
@Autowired
fournisseurRepository fouRep;
	@Override
	public fournisseur addFournisseur(fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return fouRep.save(fournisseur);
	}

	@Override
	public fournisseur updateFournisseur(fournisseur fournisseur, Long idfournisseur) {
		// TODO Auto-generated method stub
		fournisseur fr = fouRep.findById(idfournisseur).get();
		fr.setAdresse(fournisseur.getAdresse());
		fr.setNumtel(fournisseur.getNumtel());
		fr.setPays(fournisseur.getPays());
		fr.setPays(fournisseur.getPays());
		fr.setCodepostal(fournisseur.getCodepostal());
		
		
		return fouRep.save(fr);
	}

	@Override
	public void deleteFournisseur(Long idfour) {
		  Optional<fournisseur> fourOptional = fouRep.findById(idfour);
		    
		    if (fourOptional.isPresent()) {
		    	fouRep.deleteById(idfour);
		        
		    } 
		
	}

	@Override
	public List<fournisseur> GetallFourni() {
		// TODO Auto-generated method stub
		return fouRep.findAll();
	}

	
	
	public fournisseur getFournisseurById(Long id) {
        return fouRep.findByIdfournisseur(id);
    }

	
	
}
