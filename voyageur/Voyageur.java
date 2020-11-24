package voyageur;

import listeenumeration.ClasseAvion;

public class Voyageur implements Comparable{
    private int numeroVoyageur;
    private String numeroSiege;
    private String nom;
    private ClasseAvion classeAvion;

    public Voyageur(int numeroVoyageur, String numeroSiege, String nom, ClasseAvion classeAvion) {
        this.numeroVoyageur = numeroVoyageur;
        this.numeroSiege = numeroSiege;
        this.nom = nom;
        this.classeAvion = classeAvion;
    }

    @Override
    public String toString() {
        return ("Voyageur : " + numeroVoyageur
                +" nom : "+nom
                +" siege : "
                +numeroSiege
                +" classe : "+classeAvion);

    }
    @Override
    public int compareTo(Object o){
        return 0;
    }
}
