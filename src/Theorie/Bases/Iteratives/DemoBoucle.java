package Theorie.Bases.Iteratives;

public class DemoBoucle {
    public static void main(String[] args) {
        int[] myArray = new int[] { 1, 2, 3, 4, 5 };

        /*
            while
         */

        System.out.println("\n--- while ---\n");
        // Initialisation
        int index = 0;

        // Condition
        while (index < myArray.length) {
            System.out.println("myArray[" + index + "] = " + myArray[index]);

            // Incrémentation
            index++;
        }

        /*
            do ... while
         */

        System.out.println("\n--- do ... while ---\n");
        // Initialisation
        index = 0;

        // Condition
        do {
            System.out.println("myArray[" + index + "] = " + myArray[index]);

            // Incrémentation
            index++;
        } while (index < myArray.length);

        /*
            for
         */

        System.out.println("\n--- for ---\n");
        //     Initia.      Condit.       Incrém.
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }

        /*
            foreach
         */

        System.out.println("\n--- foreach ---\n");

        index = 0;
        for (int value : myArray) {
            System.out.println("myArray[" + index++ + "] = " + value);
        }

        System.out.println("\n--- foreach avec un tableau à 2 dimensions ---\n");

        int[][] myArray2 = new int[][] { {0, 1}, {2, 3} };

        int i = 0;
        for (int[] subArray : myArray2) {
            int j = 0;
            for (int value : subArray) {
                System.out.print("myArray2[" + i + "][" + j++ + "] = " + value + " ");
            }
            i++;
            System.out.println("");
        }
    }
}
