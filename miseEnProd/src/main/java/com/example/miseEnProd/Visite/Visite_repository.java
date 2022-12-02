package com.example.miseEnProd.Visite;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Visite_repository extends JpaRepository <Visite_table, Integer>{
    List<Visite_table> findByVille (String ville);
}