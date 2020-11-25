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

    public int getNumeroVoyageur() {
        return numeroVoyageur;
    }

    public String getNumeroSiege() {
        return numeroSiege;
    }

    public String getNom() {
        return nom;
    }

    public ClasseAvion getClasseAvion() {
        return classeAvion;
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
    public int compareTo(Object obj){
        Voyageur voyageurACompare = (Voyageur) obj; // cast de obj en voyageur
        System.out.println(this.classeAvion);
        System.out.println(voyageurACompare.getClasseAvion());
        int i = this.classeAvion.compareTo(voyageurACompare.getClasseAvion());
        System.out.println(i);
        return i;
    }
}
