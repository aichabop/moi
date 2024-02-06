package entities;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nom; 
    private String prenom; 
    private String telephone;
    private ArrayList<Compte>compte;
    
    public ArrayList<Compte> getCompte() {
        return compte;
    }
    public void setCompte(ArrayList<Compte> compte) {
        this.compte = compte;
    }
    public Client() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", compte="
                + compte + "]";
    }
}
