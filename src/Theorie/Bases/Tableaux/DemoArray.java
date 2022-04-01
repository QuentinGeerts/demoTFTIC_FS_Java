package Theorie.Bases.Tableaux;

import java.util.Random;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        /*
            Tableaux à une dimension
         */

        System.out.println("\n--- Tableau à une dimension ---\n");
        int[] myArray = new int[5];

        // Accès à un indice hors de portée
        // ArrayIndexOutOfBoundsException
        // System.out.println(myArray[5]);

        System.out.println("Taille du tableau : " + myArray.length);

        System.out.println("\n--- Remplissage du tableau : myArray ---\n");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Entrez une valeur : ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("\n--- Parcours du tableau : myArray ---\n[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);

            if (i < myArray.length - 1) System.out.print(" - ");
        }
        System.out.println("]");

        System.out.print("\n--- Création d'un tableau avec une taille explicite ---\n");
        int[] myArray2 = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] : " + myArray[i]);
        }

        /*
            Tableau à plusieurs dimensions
         */

        System.out.print("\n--- Tableau à plusieurs dimensions ---\n");
        int[][] myArray3 = new int[2][4];

        System.out.println("Taille du tableau : " + myArray3.length); // output : 2
        System.out.println("Taille du tableau  à l'indice 0: " + myArray3[0].length); // output : 4
        System.out.println("Taille du tableau  à l'indice 1: " + myArray3[1].length); // output : 4

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                myArray3[i][j] = rng.nextInt(10);
            }
        }

        for (int i = 0; i < myArray3.length; i++) {
            for (int j = 0; j < myArray3[i].length; j++) {
                System.out.println("myArray3[" + i + "][" + j + "] : " + myArray3[i][j]);
            }
        }

        System.out.print("\n--- Tableau à 3 dimensions ---\n");
        int[][][] myArray4 = new int[3][3][3];

        for (int i = 0; i < myArray4.length; i++) {
            for (int j = 0; j < myArray4[i].length; j++) {
                for (int k = 0; k < myArray4[i][j].length; k++) {
                    myArray4[i][j][k] = rng.nextInt(10);
                    System.out.print(myArray4[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
