package com.example.foot.repository;

import com.example.foot.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
    List<Equipe> findAllByType(int note);
}
