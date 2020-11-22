package compte.titulaire;
import compte.compte.Compte;

public class Titulaire extends Compte {
    String titulaire;

    public Titulaire(String titulaire, String reference) {
        super(reference);
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void afficherInformations() {

        System.out.println("Compte : " + reference + " Titulaire : " + titulaire);

    }
}

