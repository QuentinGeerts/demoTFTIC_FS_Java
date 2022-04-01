package Theorie.Bases.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {

        // Queue : FIFO (First In First Out)

        /*
            Constructeur
         */

        // PriorityQueue()
        Queue myQueue = new PriorityQueue();

        /*
            Méthodes
         */

        // boolean offert(Object)
        // > Ajouter un élément en tête de liste

        System.out.println("\n--- boolean offert(Object) ---\n");

        System.out.println( "Élément ajouté ? : " + myQueue.offer(1) );
        System.out.println( "Élément ajouté ? : " + myQueue.offer(2) );
        System.out.println( "Élément ajouté ? : " + myQueue.offer(3) );
        System.out.println( "Élément ajouté ? : " + myQueue.offer(4) );

        System.out.println("myQueue : " + myQueue);

        // Object peek()
        // > Récupérer l'élément en tête de liste (sans le retirer)

        System.out.println("\n--- Object poll() ---\n");

        System.out.println( "Élément récupéré : " + myQueue.peek() );
        System.out.println( "Élément récupéré : " + myQueue.peek() );
        System.out.println( "Élément récupéré : " + myQueue.peek() );
        System.out.println( "Élément récupéré : " + myQueue.peek() );

        System.out.println("myQueue : " + myQueue);

        // Object poll()
        // > Retirer l'élément en tête de liste

        System.out.println("\n--- Object poll() ---\n");

        System.out.println( "Élément retiré : " + myQueue.poll() );
        System.out.println( "Élément retiré : " + myQueue.poll() );
        System.out.println( "Élément retiré : " + myQueue.poll() );
        System.out.println( "Élément retiré : " + myQueue.poll() );

        System.out.println("myQueue : " + myQueue);

    }

}
