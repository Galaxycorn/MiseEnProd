package com.example.miseEnProd.Visite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Visite_service {
    @Autowired
    private Visite_repository visite_repository;

    public Visite_table getCentre(int id){
        return visite_repository.getReferenceById(id);
    }

    public List<Visite_table> getCentres(){
        return visite_repository.findAll();
    }

    public List<Visite_table>getByVille(String ville){
        List<Visite_table> centres=new ArrayList<>();
        visite_repository.findByVille(ville).forEach(centres::add);;
        return centres;
    }
}

