package com.example.foot.repository;
import com.example.foot.model.Generale;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneraleRepository extends JpaRepository<Generale,Integer> {
    List<Generale> findAll();
}
