import listeenumeration.JourSemaine;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;

public class TestDiversDateDecimalStringEnumCollection {

    public static void main(String[] args) throws ParseException {

        System.out.println("integration GITHUB");

        System.out.println("test sur dates");

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar " + calendar);

        LocalDate date1 = LocalDate.of(2020, 11, 22);
        System.out.println("date1        : " + date1);
        date1 = date1.plusDays(1);
        System.out.println("date1 + 1j : : " + date1);
        date1 = date1.minusDays(1);
        System.out.println("date1 - 1j : : " + date1);


        System.out.println("test sur décimal");

        DecimalFormat decimalFormat = new DecimalFormat("############.##");

//        float montant1Float;
//        montant1Float = (float) 3790.14;
//        System.out.println("3790.14 en float : " +  montant1Float);
//        System.out.println("3790.14 en decimal format : " +  decimalFormat.format(montant1Float));
//        float montant2Float;
//        montant2Float = (float) 1550.53;
//        System.out.println("1550.53 en float : " +  montant2Float);
//        float resultFloat = montant1Float - montant2Float;
//        System.out.println("difference en float : " +  resultFloat);

        double montant1Double;
        montant1Double = (double) 3790.14;
        System.out.println("3790.14 en double : " + montant1Double);
        double montant2Double;
        montant2Double = (double) 1550.53;
        System.out.println("1550.53 en double : " + montant2Double);
        double resultDouble = montant1Double - montant2Double;
        System.out.println("difference en Double : " + resultDouble);
        BigDecimal resultBigDecimal = new BigDecimal(resultDouble).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("difference en BigDecimal : " + resultBigDecimal);

        //    resultDouble = (double) decimalFormat.format(montant1Double - montant2Double);
//        System.out.println("difference en Double : " + decimalFormat.format(montant1Double - montant2Double));
//
//        BigDecimal montantBig = new BigDecimal(montant1Double).setScale(2, BigDecimal.ROUND_HALF_UP);
//        System.out.println("Big decimal : " + montantBig);

//        LocalDateTime today = LocalDateTime.now();     //Today
//        LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
//        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day
//        System.out.println("Today:     " + today);
//        System.out.println("Tomorrow:  " + tomorrow);
//        System.out.println("Yesterday: " + yesterday);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Date date1 = simpleDateFormat.parse("2020/11/20");
//        Date date2 = simpleDateFormat.parse("2020/11/21");
//        System.out.println(date1 + " " + date2);
//        calendar.getTime();

          JourSemaine joursemaine = JourSemaine.Lundi;
          System.out.println("essai enum : " +joursemaine);

        String chaineCaractereEntree = "Ceci est une phrase contenant 3 a";
        char caractere = 'a';
        System.out.println("chaine de caractére : " +chaineCaractereEntree+" en majuscule :"+passerEnMajuscule(chaineCaractereEntree));
        System.out.println("chaine de caractére : " +chaineCaractereEntree
                +" nb caractere :"+caractere+
                " "+compterCaractereDansChaine(chaineCaractereEntree,caractere));

        char c1 = 'a';
        char c2 = 'Z';
        System.out.println("chaine de caractére : " +chaineCaractereEntree
                +" remplacer :"+c1+" par : "+c2+ " --> "
                +transformerCaractere1enCaractere2(chaineCaractereEntree,c1,c2));

        System.out.println("chaine de caractére : " +chaineCaractereEntree
                +" raccourcie :"
                +raccourcirChaineCaractere(chaineCaractereEntree));
    }

    public static String passerEnMajuscule(String chaineCaractereEntree){
        return chaineCaractereEntree.toUpperCase();

    }
    public static int compterCaractereDansChaine(String chaineCaractereEntree, char caractere){
        int compteur = 0;
        for (int i = 0; i < chaineCaractereEntree.toCharArray().length; i++){
           if (chaineCaractereEntree.toCharArray()[i] == caractere) {
                compteur++;
           }
          }
         return compteur;
    }

    public static String transformerCaractere1enCaractere2(String chaineCaractereEntree, char c1, char c2){
        return chaineCaractereEntree.replace(c1,c2);

    }

    private static String raccourcirChaineCaractere(String chaineCaractereEntree){
        if(chaineCaractereEntree.length()<10){
            throw new RuntimeException("longueur chaine trop courte");
        }
        return chaineCaractereEntree.substring(0,5)+chaineCaractereEntree.substring(10);

    }
}
