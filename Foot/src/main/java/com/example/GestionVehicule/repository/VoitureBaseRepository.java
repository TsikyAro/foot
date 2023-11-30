package com.example.foot.repository;

import com.example.foot.model.VoitureBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureBaseRepository  extends JpaRepository<VoitureBase,Integer> {
    List<VoitureBase> findAll();

}
