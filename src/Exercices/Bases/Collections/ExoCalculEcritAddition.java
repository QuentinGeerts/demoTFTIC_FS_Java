package Exercices.Bases.Collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExoCalculEcritAddition {

    public static void main(String[] args) {

        /*
            Demandez à l'utilisateur d'introduire deux nombres au clavier et faites
            l'addition de ces deux nombres en ne calculant que caractères par caractères.
         */

        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de rentrer les deux nombres

        System.out.println("Entrez le premier nombre : ");
        String number1 = sc.nextLine();

        System.out.println("Entrez le second nombre : ");
        String number2 = sc.nextLine();

        Stack<Character> sNumber1 = new Stack<>();
        Stack<Character> sNumber2 = new Stack<>();

        // Insérer les chiffres de mes nombres dans les stacks
        for (int i = 0; i < number1.length(); i++) {
            sNumber1.push(number1.charAt(i));
        }

        for (int i = 0; i < number2.length(); i++) {
            sNumber2.push(number2.charAt(i));
        }
        
        // Vérifier quel nombre est le plus grand
        int maxLength = sNumber1.size() > sNumber2.size() ? sNumber1.size() : sNumber2.size();

        Stack<String> qResult = new Stack<>();
        int report = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = sNumber1.size() > 0 ? Integer.parseInt(sNumber1.pop().toString()) : 0;
            int digit2 = sNumber2.size() > 0 ? Integer.parseInt(sNumber2.pop().toString()) : 0;

            int currentSum = digit1 + digit2 + report;
            report = 0;

            if (currentSum > 9) {
                currentSum = currentSum - 10;
                report = 1;
            }

            qResult.push(String.valueOf(currentSum));
        }

        String stringifyNumber = "";


        int qResultLength = qResult.size();
        for (int i = 0; i < qResultLength; i++) {
            stringifyNumber += qResult.pop();
        }

        int finalResult = Integer.parseInt(stringifyNumber);
        System.out.println(number1 + " + " + number2 + " = " + finalResult);
    }

}
