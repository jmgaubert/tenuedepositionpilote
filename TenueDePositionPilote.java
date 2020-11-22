import compte.compte.Compte;
import compte.mouvement.Mouvement;
import compte.solde.Solde;
import compte.titulaire.Titulaire;
import virement.bordereauvirement.BordereauVirement;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TenueDePositionPilote {

    public static void main(String[] args) throws ParseException {

        System.out.println("projet pilote tenue de position");

        /* simule la zone de donnee recue de la transaction (par ex) */
        String referenceVirementRecu;
        String referenceCompteEmetteurRecu;
        String referenceCompteRecepteurRecu;
        LocalDate dateVirementRecu;
        double montantRecu;
        String libelleRecu;
        boolean informationBeneficiaireRecu;

        referenceVirementRecu = "virement 0001";
        referenceCompteEmetteurRecu = "cptref00001";
        referenceCompteRecepteurRecu = "cptref00002";
        dateVirementRecu = LocalDate.of(2020,11,20);
        montantRecu = (double) 1550.53;
        libelleRecu = "virement pour anniversaire";
        informationBeneficiaireRecu = true;
        /* simule la zone de donnee recue de la transaction (par ex) */


        BordereauVirement bordereauVirement = new BordereauVirement(
                referenceVirementRecu,
                referenceCompteEmetteurRecu,
                referenceCompteRecepteurRecu,
                dateVirementRecu,
                montantRecu,
                libelleRecu,
                informationBeneficiaireRecu);

        bordereauVirement.afficherInformations();
        bordereauVirement.executerBordereauVirement();

    }
}
