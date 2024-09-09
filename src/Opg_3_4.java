import java.util.Scanner;
public class Opg_3_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast brugernavn.");
        String userName = input.next();

        System.out.println("Indtast password.");
        String userPassword = input.next();

        // tjekker om brugernavnet er rigtigt og sætter boolean trueName til true eller false
        boolean trueName = userName.equals("admin");

        // tjekker om passwordet er rigtigt og sætter boolean truePassword til true eller false
        boolean truePassword = userPassword.equals("1234");

        // tjekker om både boolean trueName og truePassword er sande og giver den rette besked ud fra resultatet.
        if (trueName && truePassword) {
            System.out.println("Adgang givet.");
        }

        else {
            System.out.println("Adgang nægtet.");
        }

    }
}
