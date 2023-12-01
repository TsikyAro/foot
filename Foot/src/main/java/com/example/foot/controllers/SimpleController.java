package com.example.foot.controllers;

import com.example.foot.model.Equipe;
import com.example.foot.model.Generale;
import com.example.foot.model.Users;
import com.example.foot.repository.EquipeRepository;
import com.example.foot.repository.GeneraleRepository;
import com.example.foot.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
    @Autowired UsersRepository users;
    @Autowired EquipeRepository equipe;
    @Autowired GeneraleRepository generale;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/login")
    public Users login(String mail,String mdp) {
        System.out.println(mail+" dm:"+mdp);
        Users user = users.findByMailAndMdp(mail,mdp);
        return  user;
    }
    @GetMapping("domicile")
    public List<Equipe> domicile(int i){
        System.out.println(i);
        List<Equipe> domicile = null;
        if(i!=2){
            domicile = equipe.findAllByType(i);
        }
        return  domicile;
    }
    @GetMapping("generale")
    public List<Generale> domicile(){
        List<Generale> domicile = null;
        domicile = generale.findAll();
        return  domicile;
    }


}
