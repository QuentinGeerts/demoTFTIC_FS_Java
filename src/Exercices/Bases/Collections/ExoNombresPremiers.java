package Exercices.Bases.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoNombresPremiers {

    public static void main(String[] args) {

        /*
            Grâce à une boucle "while" et à l'aide d'une collection,
            calculez les nombres premiers inférieur à une nombre entier
            entré au clavier.
         */

        // Déclaration
        Scanner sc = new Scanner(System.in);
        ArrayList primeNumbers = new ArrayList();

        // Demander à l'utilisateur d'entrer un nombre entier (la valeur maximum des nombres premiers)
        System.out.println("Entrez un nombre (limite à atteindre) : ");
        int maxValue = Integer.parseInt(sc.nextLine());

        // Nombre est premier :
        // - Division par 1 et par lui même UNIQUEMENT

        int currentValue = 2;

        while ( currentValue <= maxValue ) {

            // Vérifier si le valeur actuelle est un nombre premier ou pas
            boolean isPrimeNumber = true;

            int divider = 2;

            while ( divider < currentValue ) {
                if ( currentValue % divider == 0 ) isPrimeNumber = false;
                divider ++;
            }

            if ( isPrimeNumber ) primeNumbers.add(currentValue);

            currentValue++;
        }

        primeNumbers.forEach(primeNumber -> {
            System.out.format("%5d", primeNumber);

        });


    }

}
