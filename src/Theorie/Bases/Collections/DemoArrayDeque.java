package Theorie.Bases.Collections;

import java.util.ArrayDeque;

public class DemoArrayDeque {

    public static void main(String[] args) {

        // Peut fonctionner une stack et/ou une queue

        /*
            Constructeur
         */

        ArrayDeque myArrayDeque = new ArrayDeque();

        /*
            Méthodes
         */

        // void addFirst(Object)
        // > Ajouter l'élément  au début de la liste

        System.out.println("\n--- void addFirst(Object) ---\n");

        myArrayDeque.addFirst(1);
        myArrayDeque.addFirst(2);
        myArrayDeque.addFirst(3);
        myArrayDeque.addFirst(4);

        System.out.println("myArrayDeque : " + myArrayDeque);


        // void addLast(Object)
        // > Ajouter l'élément  à la fin de la liste

        System.out.println("\n--- void addLast(Object) ---\n");

        myArrayDeque.addLast(10);
        myArrayDeque.addLast(20);
        myArrayDeque.addLast(30);
        myArrayDeque.addLast(40);

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object getFirst()
        // > Ajouter l'élément  à la fin de la liste

        System.out.println("\n--- Object getFirst() ---\n");

        System.out.println("Élément récupéré : " + myArrayDeque.getFirst()); // output : 4
        System.out.println("Élément récupéré : " + myArrayDeque.getFirst()); // output : 4
        System.out.println("Élément récupéré : " + myArrayDeque.getFirst()); // output : 4
        System.out.println("Élément récupéré : " + myArrayDeque.getFirst()); // output : 4

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object getLast()
        // > Ajouter l'élément  à la fin de la liste

        System.out.println("\n--- Object getLast() ---\n");

        System.out.println("Élément récupéré : " + myArrayDeque.getLast()); // output : 40
        System.out.println("Élément récupéré : " + myArrayDeque.getLast()); // output : 40
        System.out.println("Élément récupéré : " + myArrayDeque.getLast()); // output : 40
        System.out.println("Élément récupéré : " + myArrayDeque.getLast()); // output : 40

        System.out.println("myArrayDeque : " + myArrayDeque);


        // Object removeFirst()
        // > Ajouter l'élément  à la fin de la liste

        System.out.println("\n--- Object removeFirst() ---\n");

        System.out.println("Élément supprimé : " + myArrayDeque.removeFirst()); // output : 4
        System.out.println("Élément supprimé : " + myArrayDeque.removeFirst()); // output : 3
        System.out.println("Élément supprimé : " + myArrayDeque.removeFirst()); // output : 2
        System.out.println("Élément supprimé : " + myArrayDeque.removeFirst()); // output : 1

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object removeLast()
        // > Ajouter l'élément  à la fin de la liste

        System.out.println("\n--- Object removeLast() ---\n");

        System.out.println("Élément supprimé : " + myArrayDeque.removeLast()); // output : 4
        System.out.println("Élément supprimé : " + myArrayDeque.removeLast()); // output : 3
        System.out.println("Élément supprimé : " + myArrayDeque.removeLast()); // output : 2
        System.out.println("Élément supprimé : " + myArrayDeque.removeLast()); // output : 1

        System.out.println("myArrayDeque : " + myArrayDeque);


    }

}
