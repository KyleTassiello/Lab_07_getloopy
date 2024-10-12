import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        String continueYN = "";
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int diceSum = 0;
        int dieRolls = 0;
        Random rnd = new Random();
        boolean tripleDone = false;

        try (Scanner in = new Scanner(System.in)) {
            do {
                tripleDone = false;
                dieRolls= 0;
                System.out.println();
                System.out.printf("%5s%5s%5s%5s%5s", "Roll", "Die1", "Die2", "Die3", "Sum");
                System.out.print("\n-------------------------");
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    die3 = rnd.nextInt(6) + 1;
                    diceSum = die1 + die2 + die3;
                    dieRolls++;

                    System.out.printf("%n%5d%5d%5d%5d%5d", dieRolls, die1, die2, die3, diceSum);

                    if (die1 == die2 && die1 == die3) {
                        tripleDone = true;
                    }

                } while (!tripleDone);

                System.out.print("\n\nContinue? Y/N: ");
                continueYN = in.nextLine();

            } while(continueYN.equalsIgnoreCase("Y"));

        }
    }
}