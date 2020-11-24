import listeenumeration.ClasseAvion;
import voyageur.Voyageur;

import java.util.*;

public class TestCollections {

    public static void main(String[] args){

        List<String> listStringImplem1 = new ArrayList<String>();
        listStringImplem1.add("bonjour");
        listStringImplem1.add("je suis");
        listStringImplem1.add("une liste");
        listStringImplem1.add("de type arraylist");
        System.out.println(listStringImplem1);
        listStringImplem1.sort(null);
        System.out.println(listStringImplem1);

        Set<String> setStringImplem1 = new TreeSet<>();
        setStringImplem1.add("bonjour");
        setStringImplem1.add("je suis");
        setStringImplem1.add("une liste");
        setStringImplem1.add("de type arraylist");
        System.out.println(setStringImplem1);

        Voyageur voyageur1 = new Voyageur(1200,"75B","Gaubert", ClasseAvion.economique);
        System.out.println(voyageur1);
        Voyageur voyageur2 = new Voyageur(1201,"01A","Dupont", ClasseAvion.premiere);
        System.out.println(voyageur2);
        Voyageur voyageur3 = new Voyageur(1202,"06B","Labelle", ClasseAvion.business);
        System.out.println(voyageur3);

        PriorityQueue<Voyageur> fileVoyageur = new PriorityQueue<Voyageur>();
        fileVoyageur.add(voyageur1);
        fileVoyageur.add(voyageur2);
        fileVoyageur.add(voyageur3);
        System.out.println(fileVoyageur);

        int size = fileVoyageur.size();
        for (int i = 0; i < size; i++){
            System.out.println(fileVoyageur.poll());
        }

    }

}
