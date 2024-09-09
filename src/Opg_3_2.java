public class Opg_3_2 {
    public static void main(String[] args) {

        double randomAlder = (Math.random() * 100); // genererer en tilfældig alder mellem 1 og 100

        System.out.println("Personen er " + randomAlder + " år gammel."); // printer alderen

        // tjekker om personen er over 18 år, og om de må stemme
        if (randomAlder < 18) {
            System.out.println("De må ikke stemme.");
        }

        else {System.out.println("De må gerne stemme.");
        }
    }
}
