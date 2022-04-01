package Theorie.Bases.Collections;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {

        // LIFO - Last In First Out
        // Exemple : Pile d'assiettes

        /*
            Constructeur
         */

        Stack myStack = new Stack<>();

        /*
            Méthodes
         */

        // Object push(Object)
        // > Ajouter un élément en haut de la pile (dernier élément)

        System.out.println("\n--- Object push(Object) ---\n");

        System.out.println("Élément ajouté : " + myStack.push(1));
        System.out.println("Élément ajouté : " + myStack.push(2));
        System.out.println("Élément ajouté : " + myStack.push(3));
        System.out.println("Élément ajouté : " + myStack.push(4));

        System.out.println("myStack : " + myStack);

        // Object peek()
        // > Récupérer l'élément en haut de la pile (dernier élément) (sans le retirer)

        System.out.println("\n--- Object peek() ---\n");

        System.out.println("Dernier élément récupéré : " + myStack.peek()); // output : 4
        System.out.println("Dernier élément récupéré : " + myStack.peek()); // output : 4
        System.out.println("Dernier élément récupéré : " + myStack.peek()); // output : 4
        System.out.println("Dernier élément récupéré : " + myStack.peek()); // output : 4

        System.out.println("myStack : " + myStack); // output : [1, 2, 3, 4]

        // boolean empty()
        // > Vérifier si la stack est vide ou non

        System.out.println("\n--- boolean empty() ---\n");

        System.out.println("Stack vide ? : " + myStack.empty());

        System.out.println("myStack : " + myStack);

        // int search()
        // > Récupérer le nombre d'itérations pour obtenir la valeur proposée en paramètre

        System.out.println("\n--- int search() ---\n");

        System.out.println("Nombre d'itérations pour obtenir la valeur '4' ? : " + myStack.search(4));

        System.out.println("myStack : " + myStack);

        // Object pop()
        // > Retirer l'élément en haut de la pile (dernier élément)

        System.out.println("\n--- Object pop() ---\n");

        System.out.println("Élément supprimé : " + myStack.pop()); // output : 4
        System.out.println("Élément supprimé : " + myStack.pop()); // output : 3
        System.out.println("Élément supprimé : " + myStack.pop()); // output : 2
        System.out.println("Élément supprimé : " + myStack.pop()); // output : 1

        System.out.println("myStack : " + myStack); // output : []

    }
}
