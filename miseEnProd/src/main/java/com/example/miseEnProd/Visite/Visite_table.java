package com.example.miseEnProd.Visite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Centre")
public class Visite_table {
    @Id
    private Integer centre_id;
    private String nom;
    private String adresse;
    private String ville;   

    public Integer getCentreId(){
    return centre_id;
    }

    public String getNom(){
        return nom;
    }

    public void setCentre_id(Integer centre_id) {
        this.centre_id = centre_id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getVille(){
        return ville;
    }
    
}
