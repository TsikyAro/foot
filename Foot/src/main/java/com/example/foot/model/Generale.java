package com.example.foot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Generale")
public class Generale {
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

    public Generale() {
    }
    public Generale(String nomequipe, String competition, int buts, double tirpm, int rouge, int jaune, double possession, double passeReussi, double aerienGagne, double note) {
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

}
