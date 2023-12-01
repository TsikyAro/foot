package com.example.foot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Entity
@Table(name="Equipe")
public class Equipe {

    @Id
    @Column(name = "idequipe")
    int idEquipe;
    @Column(name = "nomequipe")
    String nomequipe;
    @Column(name = "competition")
    String competition;
    @Column(name="buts")
    int buts;
    @Column(name="tirpm")
    double tirpm;
    @Column(name = "jaune")
    int rouge;
    @Column(name = "rouge")
    int jaune;
    @Column(name = "possession")
    double  possession;
    @Column(name ="passereussi")
    double passeReussi;
    @Column(name = "Aeriengagne")
    double AerienGagne;
    @Column(name = "note")
    double note;
    @Column(name = "type")
    int type;
    public Equipe [] selectEquipe(int type){
        Connexion c = new Connexion();
        ArrayList<Equipe> liste = new ArrayList<Equipe>();
        try{
            Connection con = c.login();
            Statement stm=con.createStatement();
            String sql = "SELECT * FROM \"public\".\"Equipe\" where type ="+type;
            System.out.println(sql);
            ResultSet res=stm.executeQuery(sql);
            while (res.next()){
                Equipe terre = new Equipe(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4),res.getDouble(5),res.getInt(6),res.getInt(7),res.getDouble(8),res.getDouble(9),res.getDouble(10),res.getDouble(11),res.getInt(12));
                liste.add(terre);
            }
            stm.close();
            con.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        Equipe[] terra = new Equipe[liste.size()];
        liste.toArray(terra);
        return terra;
    }
    public Equipe() {
    }
    public Equipe(int idEquipe,String nomequipe, String competition, int buts, double tirpm, int rouge, int jaune, double possession, double passeReussi, double aerienGagne, double note, int type) {
        this.idEquipe = idEquipe;
        this.nomequipe = nomequipe;
        this.competition = competition;
        this.buts = buts;
        this.tirpm = tirpm;
        this.rouge = rouge;
        this.jaune = jaune;
        this.possession = possession;
        this.passeReussi = passeReussi;
        AerienGagne = aerienGagne;
        this.note = note;
        this.type = type;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomequipe() {
        return nomequipe;
    }

    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public int getButs() {
        return buts;
    }

    public void setButs(int buts) {
        this.buts = buts;
    }

    public double getTirpm() {
        return tirpm;
    }

    public void setTirpm(double tirpm) {
        this.tirpm = tirpm;
    }

    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        this.rouge = rouge;
    }

    public int getJaune() {
        return jaune;
    }

    public void setJaune(int jaune) {
        this.jaune = jaune;
    }

    public double getPossession() {
        return possession;
    }

    public void setPossession(double possession) {
        this.possession = possession;
    }

    public double getPasseReussi() {
        return passeReussi;
    }

    public void setPasseReussi(double passeReussi) {
        this.passeReussi = passeReussi;
    }

    public double getAerienGagne() {
        return AerienGagne;
    }

    public void setAerienGagne(double aerienGagne) {
        AerienGagne = aerienGagne;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
