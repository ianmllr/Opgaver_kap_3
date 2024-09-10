import java.util.Scanner;
public class Opg_3_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int highScore = 0;
        int totalScore = 0;
        String topPlayer = "";
        String category = "";

        System.out.println("Indtast antallet af spillere.");
        int numberOfPlayers = input.nextInt();

        int currentPlayer = 1;
        while (currentPlayer <= numberOfPlayers) {
            System.out.println("Indtast navnet på spiller " + currentPlayer + ".");
            String playerName = input.next();

            System.out.println("Indtast en score mellem 1 og 100 for spiller " + currentPlayer + ".");
            int score = input.nextInt();

            // tjekker om scoren er inden for 1-100
            if (score < 0 || score > 100) {
                System.out.println("Ugyldig score. Prøv igen.");
                continue;
            }

            totalScore = (totalScore + score);
            if (score > totalScore) {
                highScore = score;
                topPlayer = playerName;
            }

            // tjekker score
            if (score >= 80) {
                category = "Hoej";
            } else if (score >=50) {
                category = "Mellem";
            } else {
                category = "Lav";
            }

            // printer besked baseret på score
            if (category.equals("Hoej")) {
                System.out.println("Du fik en høj score!");
            } else if (category.equals("Medium")) {
                System.out.println("Du fik en mellem score.");
            } else {
                System.out.println("Du fik en lav score.");
            }

            // tjekker om spilleren får bonuspoint
            boolean bonusPoint = (score >= 70 && score % 2 == 0);
            String bonusFeedback = bonusPoint ? "Du får bonuspoint" : "Du får ingen bonuspoint";
            System.out.println(bonusFeedback);

            currentPlayer++;


        }

        double averageScore = ((double)totalScore / numberOfPlayers);

        System.out.println("Spil-rapport:");
        System.out.println("Antal spillere: " + numberOfPlayers);
        System.out.println("Højeste score" + highScore);
        System.out.println("Gennemsnitlige score: " + averageScore);
        System.out.println("Bedste spiller: " + topPlayer);

    }
}
