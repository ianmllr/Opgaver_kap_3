public class Opg_3_1 {
    public static void main(String[] args) {

        double randomTemp = (Math.random() * 100) - 50; // genererer en tilfældig temperatur

        System.out.println("Temperaturen er " + randomTemp); // printer temperaturen

        // tjekker om temperaturen er over eller under 0 grader og printer resultatet
        if (randomTemp < 0) {
            System.out.println("Temperaturen er under frysepunktet.");
        } else {System.out.println("Temperaturen er over frysepunktet.");
        }
    }
}


