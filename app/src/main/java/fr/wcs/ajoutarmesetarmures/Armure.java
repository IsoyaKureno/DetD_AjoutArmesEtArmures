package fr.wcs.ajoutarmesetarmures;

public class Armure {
    private String nom;
    private int bonusArmor,maxDex;
    Armure(String nom,int bonusArmor,int maxDex){
        this.nom=nom;
        this.bonusArmor=bonusArmor;
        this.maxDex=maxDex;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public int getBonusArmor() {return bonusArmor;}
    public void setBonusArmor(int bonusArmor) {this.bonusArmor = bonusArmor;}

    public int getMaxDex() {return maxDex;}
    public void setMaxDex(int maxDex) {this.maxDex = maxDex;}
}
