package com.github.dominaspl.springbootapp.repositories;

import com.github.dominaspl.springbootapp.models.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Long> {


}
