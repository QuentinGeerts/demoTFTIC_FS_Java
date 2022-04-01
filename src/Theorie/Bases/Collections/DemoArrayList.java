package Theorie.Bases.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[] args) {

        /*
            Constructeurs
         */

        // ArrayList()
        // > Créer une instance vide de la collection avec une capacité initiale de 10

        ArrayList myDefaultArrayList = new ArrayList();

        // ArrayList(int initialCapacity)
        // > Créer une instance vide de la collection avec une capacité initiale fournie en paramètre

        ArrayList myArrayListWithCapacity = new ArrayList(20);

        // ArrayList(Collection<? extends E> c)
        // > Créer une instance contenant les éléments de la collection fournie en paramètre dans l'ordre
        // > obtenu en utilisant son iterator

        ArrayList myArrayListBasedOnAnotherList = new ArrayList(myDefaultArrayList);

        /*
            Généricité
         */

        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Quentin");
        myStringList.add("Benjamin");
        myStringList.add("Benjamin");
        myStringList.add("Benjamin");

        /*
            Méthodes
         */

        // boolean add(Object)
        // > Ajouter un élément à la fin de la liste

        System.out.println("\n--- boolean add(Object) ---\n");

        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add(1));
        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add('a'));
        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add(true));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // boolean add(int index, Object)
        // > Ajouter un élément à un index souhaité

        System.out.println("\n--- boolean add(int index, Object) ---\n");

        myDefaultArrayList.add(1, 100);
        // myDefaultArrayList.add(10, 100); // Attention, en dehors de la portée du tableau -> IndexOutOfBoundsException

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // boolean add(int index, Object)
        // > Ajouter un élément à un index souhaité

        System.out.println("\n--- boolean add(int index, Object) ---\n");


        System.out.println("Éléments ajoutés ? : " + myDefaultArrayList.addAll(myStringList));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // Object get(int index)
        // > Récupérer l'élément du tableau dont la position est précisée

        System.out.println("\n--- Object get(int index) ---\n");

        System.out.println("Élément récupéré à l'indice 4 : " + myDefaultArrayList.get(4));
        System.out.println("Élément récupéré à l'indice 1 : " + myDefaultArrayList.get(1));
        // IndexOutOfBoundsException => 10 en dehors de la portée du tableau
        // System.out.println("Élément récupéré à l'indice 10 : " + myDefaultArrayList.get(10));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // Object set(int index, Object)
        // > Modifier l'élément à la position spécifiée

        System.out.println("\n--- Object set(int index, Object) ---\n");

        System.out.println("Ancien valeur à la position 4 : " + myDefaultArrayList.set(4, 'a'));
        System.out.println("Ancien valeur à la position 1 : " + myDefaultArrayList.set(1, 250));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // int indexOf(Object)
        // > Récupérer l'indice de la première occurrence trouvée par rapport à l'objet envoyé en paramètre

        System.out.println("\n--- int indexOf(Object) ---\n");

        System.out.println("L'index  de la valeur recherchée : " + myDefaultArrayList.indexOf('a'));
        System.out.println("L'index  de la valeur recherchée : " + myDefaultArrayList.indexOf('z'));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // int lastIndexOf(Object)
        // > Récupérer l'indice de la dernière occurrence trouvée par rapport à l'objet envoyé en paramètre

        System.out.println("\n--- int lastIndexOf(Object) ---\n");

        System.out.println("L'index  de la valeur recherchée : " + myDefaultArrayList.lastIndexOf('a'));
        System.out.println("L'index  de la valeur recherchée : " + myDefaultArrayList.lastIndexOf('z'));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // boolean isEmpty()
        // > Indiquer si le tableau est vide

        System.out.println("\n--- boolean isEmpty() ---\n");

        System.out.println("Tableau vide ? : " + myDefaultArrayList.isEmpty());

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // boolean remove(Object o)
        // Object remove(int index)
        // > Indiquer si le tableau est vide

        System.out.println("\n--- boolean remove(Object o) ---\n");

        System.out.println("Élément retiré ? : " + myDefaultArrayList.remove("Benjamin"));
        System.out.println("Élément retiré ? : " + myDefaultArrayList.remove("z"));
        System.out.println("Élément retiré : " + myDefaultArrayList.remove(0));
        System.out.println("Éléments retirés ? : " + myDefaultArrayList.removeAll(Arrays.asList('a', 'b', 250)));

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

        // int size()
        // > Retourner le nombre d'éléments dans la liste

        System.out.println("\n--- int size() ---\n");

        System.out.println("Nombre d'éléments dans la liste : " + myDefaultArrayList.size());

        // void clear()
        // > Supprimer tous les éléments de la liste

        System.out.println("\n--- void clear() ---\n");

        myDefaultArrayList.clear();

        System.out.println("myDefaultArrayList : " + myDefaultArrayList);

    }
}
