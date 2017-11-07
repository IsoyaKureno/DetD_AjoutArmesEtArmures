package fr.wcs.ajoutarmesetarmures;

class Arme {
    private String nom,degats,typeDommage;
    private int limCrit,multiCrit;
    Arme(String nom,String degats,int limCrit,int multiCrit,String typeDommage){
        this.nom=nom;
        this.degats=degats;
        this.limCrit=limCrit;
        this.multiCrit=multiCrit;
        this.typeDommage=typeDommage;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getDegats() {return degats;}
    public void setDegats(String degats) {this.degats = degats;}

    public int getLimCrit() {return limCrit;}
    public void setLimCrit(int limCrit) {this.limCrit = limCrit;}

    public int getMultiCrit() {return multiCrit;}
    public void setMultiCrit(int multiCrit) {this.multiCrit = multiCrit;}

    public String getTypeDommage() {return typeDommage;}
    public void setTypeDommage(String typeDommage) {this.typeDommage = typeDommage;}
}
