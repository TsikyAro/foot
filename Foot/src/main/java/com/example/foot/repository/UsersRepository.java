package com.example.foot.repository;
import com.example.foot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
     Users findByMailAndMdp(String mail,String mdp);
}
