package com.example.foot.controllers;

import com.example.foot.model.Home;
import com.example.foot.model.Users;
import com.example.foot.model.Voiture;
import com.example.foot.model.VoitureBase;
import com.example.foot.repository.UsersRepository;
import com.example.foot.repository.VoitureBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
    @Autowired UsersRepository users;
    @Autowired VoitureBaseRepository voiture;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }
    @GetMapping("/homie")
    public String homePages(String donne) {
        Home home = new Home();
        String hello = home.hello();
        return  donne;
    }
    @GetMapping("/login")
    public Users login(String mail,String mdp) {
        System.out.println(mail+" dm:"+mdp);
        Users user = users.findByMailAndMdp(mail,mdp);
        return  user;
    }

    @GetMapping("/json")
    public Voiture responseJson(){
        List<VoitureBase> voit = voiture.findAll();
        VoitureBase[] voitures = voit.toArray(new VoitureBase[voit.size()]) ;
        Voiture tomobil = new Voiture();
        try {
            tomobil.setData(voitures);
        } catch (Exception e) {
            tomobil.setErreur(e.getMessage());
            e.printStackTrace();
        }
        return  tomobil;
    }
}
