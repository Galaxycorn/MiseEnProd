package com.example.miseEnProd.Visite;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Visite_rest {
    
    @Autowired 
    private Visite_service visite_service;

    @GetMapping(path = "/centres")
    public List<Visite_table> getAll(){
        return visite_service.getCentres();
    }
    @GetMapping(path = "/ville/{nomVille}")
    public List<Visite_table> getByVille(
        @PathVariable("nomVille") String ville){
        return visite_service.getByVille(ville);
    }

}
